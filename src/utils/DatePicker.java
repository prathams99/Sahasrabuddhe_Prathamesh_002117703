/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
    

public final class DatePicker {
	int monthSelect = Calendar.getInstance().get(Calendar.MONTH);
	int yearSelect = Calendar.getInstance().get(Calendar.YEAR);;
	JLabel holderLabel = new JLabel("", JLabel.CENTER);
	String dayHolder = "";
	JDialog dialogBox;
	JButton[] selectDate = new JButton[49];

	public DatePicker(JFrame parent) {
		dialogBox = new JDialog();
		dialogBox.setModal(true);
		String[] daysTitle = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		JPanel gridPanel = new JPanel(new GridLayout(7, 7));
		gridPanel.setPreferredSize(new Dimension(500, 150));

		for (int i = 0; i < selectDate.length; i++) {
			final int selection = i;
			selectDate[i] = new JButton();
			selectDate[i].setFocusPainted(false);
			selectDate[i].setBackground(Color.white);
			if (i > 6)
				selectDate[i].addActionListener((ActionListener) new ActionListenerImpl(selection));
			if (i < 7) {
				selectDate[i].setText(daysTitle[i]);
				selectDate[i].setForeground(Color.BLUE);
			}
			gridPanel.add(selectDate[i]);
		}
		JPanel newPanel = new JPanel(new GridLayout(1, 3));
		JButton previous = new JButton("<< Previous");
		previous.addActionListener((ActionEvent ae) -> {
                    monthSelect--;
                    displayDate();
                });
		newPanel.add(previous);
		newPanel.add(holderLabel);
		JButton next = new JButton("Next >>");
		next.addActionListener((ActionEvent ae) -> {
                    monthSelect++;
                    displayDate();
                });
		newPanel.add(next);
		dialogBox.add(gridPanel, BorderLayout.CENTER);
		dialogBox.add(newPanel, BorderLayout.SOUTH);
		dialogBox.pack();
		dialogBox.setLocationRelativeTo(parent);
		displayDate();
		dialogBox.setVisible(true);
	}

	public void displayDate() {
		for (int x = 7; x < selectDate.length; x++)
			selectDate[x].setText("");
		SimpleDateFormat sdf = new SimpleDateFormat(
				"MMMM yyyy");
		Calendar cal = Calendar.getInstance();
		cal.set(yearSelect, monthSelect, 1);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		for (int x = 6 + dayOfWeek, day = 1; day <= daysInMonth; x++, day++)
			selectDate[x].setText("" + day);
		holderLabel.setText(sdf.format(cal.getTime()));
		dialogBox.setTitle("Date Picker");
	}

	public String setPickedDate() {
		if (dayHolder.equals(""))
			return dayHolder;
		SimpleDateFormat sdf = new SimpleDateFormat(
				"dd-MM-yyyy");
		Calendar cal = Calendar.getInstance();
		cal.set(yearSelect, monthSelect, Integer.parseInt(dayHolder));                
		return sdf.format(cal.getTime());
	}
        
        public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
            if ((birthDate != null) && (currentDate != null)) {
                return Period.between(birthDate, currentDate).getYears();
            } else {
                return 0;
            }
        }

    private class ActionListenerImpl implements ActionListener {

        private final int selection;

        public ActionListenerImpl(int selection) {
            this.selection = selection;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            dayHolder = selectDate[selection].getActionCommand();
            dialogBox.dispose();
        }
    }
}
