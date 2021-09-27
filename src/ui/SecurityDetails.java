/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import utils.UserProfile;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author prath
 */
public class SecurityDetails extends javax.swing.JFrame {
    
    private UserProfile userProfile;
    private Image image;
    private BufferedImage bufferedImage;
    

    /**
     * Creates new form SecurityDetails
     * @param userProfile
     */
    public SecurityDetails(UserProfile userProfile) {
        this.userProfile = userProfile;
        initComponents();
        jPanel1.setAlignmentX(Component.CENTER_ALIGNMENT);
        jPanel1.setPreferredSize(new Dimension(400, 100));
        jPanel1.setMaximumSize(new Dimension(400, 100));
        
        // Catching both NPE and IOExceptions. Not using the generic Exception. (   Clean & Optimized coding :))))  )
        try {
                // Loading the static asset from the drawables folder
                bufferedImage = ImageIO.read(new File("src\\assets\\lock.jpg"));
                image = bufferedImage.getScaledInstance(lockIcon.getWidth(), lockIcon.getHeight(),
                    Image.SCALE_SMOOTH);
                lockIcon.setIcon(new ImageIcon(image));
            } catch(NullPointerException | IOException ep) {     
            }
    }
    
    /*
     * Create a seperate constructor for running the window manually.
     */
    public SecurityDetails() {
        this.userProfile = userProfile;
        initComponents();
        jPanel1.setAlignmentX(Component.CENTER_ALIGNMENT);
        jPanel1.setPreferredSize(new Dimension(400, 100));
        jPanel1.setMaximumSize(new Dimension(400, 100));
        
        // Catching both NPE and IOExceptions. Not using the generic Exception. (   Clean & Optimized coding :))))  )
        try {
                // Loading the static asset from the drawables folder
                bufferedImage = ImageIO.read(new File("src\\assets\\lock.jpg"));
                image = bufferedImage.getScaledInstance(lockIcon.getWidth(), lockIcon.getHeight(),
                    Image.SCALE_SMOOTH);
                lockIcon.setIcon(new ImageIcon(image));
            } catch(NullPointerException | IOException ep) {     
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        labelSecurityDetails = new javax.swing.JLabel();
        labelSsn = new javax.swing.JLabel();
        labelMedicalNumber = new javax.swing.JLabel();
        labelHealthPlan = new javax.swing.JLabel();
        labelBank = new javax.swing.JLabel();
        labelLicense = new javax.swing.JLabel();
        inputMedicalNo = new javax.swing.JTextField();
        inputHealthNo = new javax.swing.JTextField();
        inputLicense = new javax.swing.JTextField();
        labelVehicle = new javax.swing.JLabel();
        inputVehicle = new javax.swing.JTextField();
        labelDeviceIdentifiers = new javax.swing.JLabel();
        inputDeviceIdentifiers = new javax.swing.JTextField();
        faxLabel = new javax.swing.JLabel();
        inputFax = new javax.swing.JTextField();
        inputSsn = new javax.swing.JPasswordField();
        inputBankNo = new javax.swing.JPasswordField();
        nextButto = new javax.swing.JButton();
        lockIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));

        labelSecurityDetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelSecurityDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSecurityDetails.setText("Enter Your Security Details");

        labelSsn.setText("SSN");

        labelMedicalNumber.setText("Medical No.");

        labelHealthPlan.setText("Health Plan No.");

        labelBank.setText("Bank AC NO.");

        labelLicense.setText("License No.");

        inputMedicalNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMedicalNoActionPerformed(evt);
            }
        });

        inputHealthNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHealthNoActionPerformed(evt);
            }
        });

        labelVehicle.setText("Vehicle No.");

        labelDeviceIdentifiers.setText("Device Identifiers");

        faxLabel.setText("Fax Number");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSecurityDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDeviceIdentifiers, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelVehicle)
                    .addComponent(labelMedicalNumber)
                    .addComponent(labelHealthPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBank)
                    .addComponent(labelLicense)
                    .addComponent(labelSsn)
                    .addComponent(faxLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputMedicalNo, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(inputVehicle, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(inputDeviceIdentifiers, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(inputLicense, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(inputHealthNo, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(inputFax, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(inputSsn)
                    .addComponent(inputBankNo))
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(labelSecurityDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSsn)
                    .addComponent(inputSsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMedicalNumber)
                    .addComponent(inputMedicalNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHealthPlan)
                    .addComponent(inputHealthNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBank)
                    .addComponent(inputBankNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLicense)
                    .addComponent(inputLicense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelVehicle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDeviceIdentifiers, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputDeviceIdentifiers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(faxLabel)
                    .addComponent(inputFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {inputDeviceIdentifiers, inputFax, inputHealthNo, inputLicense, inputMedicalNo, inputVehicle});

        nextButto.setText("Next");
        nextButto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 4));
        nextButto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtoActionPerformed(evt);
            }
        });

        lockIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lockIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lockIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nextButto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(lockIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addGap(271, 271, 271)
                .addComponent(nextButto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtoActionPerformed
        storeFields();
        validateFields();
    }//GEN-LAST:event_nextButtoActionPerformed

    private void inputHealthNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHealthNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputHealthNoActionPerformed

    private void inputMedicalNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMedicalNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputMedicalNoActionPerformed

    private void storeFields() {
        // Store all user inputs as variables in the UserProfile class
        userProfile.setPersonFaxNumber(inputFax.getText());
        userProfile.setSsnUser(String.valueOf(inputSsn.getPassword()));
        userProfile.setMedicalNumber(inputMedicalNo.getText());
        userProfile.setBankAccountNumber(String.valueOf(inputBankNo.getPassword()));
        userProfile.setHealthPlanNumber(inputHealthNo.getText());
        userProfile.setLicenseNumber(inputLicense.getText());
        userProfile.setDeviceIdentifiers(inputDeviceIdentifiers.getText());
        userProfile.setVehicleNumber(inputVehicle.getText());
    }
    
    private void validateFields() {
        // Validate the details entered by the end user
        if (!userProfile.validateSsn(String.valueOf(inputSsn.getText())) || userProfile.getSsnUser() == null) {
            JOptionPane.showMessageDialog(this, "Please enter a valid 9 digit SSN.");
            return;
        }
        if (!userProfile.validateNumber(inputMedicalNo.getText()) || userProfile.getMedicalNumber().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please enter a valid medical number.");
            return;
        }
        if (!userProfile.validateNumber(inputHealthNo.getText()) || userProfile.getHealthPlanNumber().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please enter a valid health number.");
            return;
        }
        if (!userProfile.validateNumber(String.valueOf(inputBankNo.getText())) || userProfile.getBankAccountNumber().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please enter a valid bank account number.");
            return;
        }
        if (!userProfile.validateNumber(inputLicense.getText()) || userProfile.getLicenseNumber().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please enter a valid license number.");
            return;
        }
        if (!userProfile.validateNumber(inputVehicle.getText()) || userProfile.getVehicleNumber().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please enter a valid vehicle number.");
            return;
        }
        if (!userProfile.validateNumber(inputDeviceIdentifiers.getText()) || userProfile.getDeviceIdentifiers().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please enter a valid device ID.");
            return;
        }
        if (!userProfile.validateNumber(inputFax.getText()) || userProfile.getPersonFaxNumber().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please enter a valid FAX number.");
            return;
        }
        openNextPanel();
    }
    
    private void openNextPanel() {
        JOptionPane.showMessageDialog(this, "Saved succesfully!");
        SocialDetails socialDetails = new SocialDetails(userProfile);
        socialDetails.setVisible(true);
        super.dispose();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SecurityDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecurityDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecurityDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecurityDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and diuserProfilelay the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SecurityDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel faxLabel;
    private javax.swing.JPasswordField inputBankNo;
    private javax.swing.JTextField inputDeviceIdentifiers;
    private javax.swing.JTextField inputFax;
    private javax.swing.JTextField inputHealthNo;
    private javax.swing.JTextField inputLicense;
    private javax.swing.JTextField inputMedicalNo;
    private javax.swing.JPasswordField inputSsn;
    private javax.swing.JTextField inputVehicle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelBank;
    private javax.swing.JLabel labelDeviceIdentifiers;
    private javax.swing.JLabel labelHealthPlan;
    private javax.swing.JLabel labelLicense;
    private javax.swing.JLabel labelMedicalNumber;
    private javax.swing.JLabel labelSecurityDetails;
    private javax.swing.JLabel labelSsn;
    private javax.swing.JLabel labelVehicle;
    private javax.swing.JLabel lockIcon;
    private javax.swing.JButton nextButto;
    // End of variables declaration//GEN-END:variables
}