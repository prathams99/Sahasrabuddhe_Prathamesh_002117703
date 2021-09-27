/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.image.BufferedImage;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author prath
 */
public class UserProfile {
    
    // First Name and Last Name
    private String firstName;
    private String lastName;
    private String dob;
    private String age;

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }
    
    // Geographic details of the end user
    private String personAddress; // 101, Huntington Avenue, Boston, MA, 02120.
    
    // Contact details
    private String personNumber;
    private String personFaxNumber;
    
    // Email Address
    private String emailAddress;
    
    // Security details of the end user
    private String ssnUser; // Could have used varchar but can work with int. Encryption can be used for secured storage.
    private String medicalNumber;
    private String healthPlanNumber;
    private String bankAccountNumber;
    private String licenseNumber;
    private String vehicleNumber;
    private String deviceIdentifiers;
    
    // Social Media details
    private String linkedinUrl;
    private final String linkedInDomain = "https://www.linkedin.com/in/";
    private String ipAddress;
    
    // Other Details
    private BufferedImage img;
    private String photoPath;
    
    // Validators
    private final String nameRegex = "^[a-zA-Z]+$";
    private final String phoneRegex = "\\d{10}";
    private final String dateRegex = "^\\d{2}-\\d{2}-\\d{4}$";
    public static final Pattern EMAIL_ADDRESS_REGEX = 
        Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public final String[] imageExtensions = {"png", "jpg", "jpeg", "svg"};
    public final String ssnRegex = "^[0-9]{9}$";
    public final String numberRegex = "^[0-9]*$";
    public final String ipRegex = "^[0-9.]*$";
    
    public boolean isImage(String inputExtension) {
        boolean found = true;
        for (String item : imageExtensions) {
            if (!inputExtension.contains(item)) {
                found = false;
                break;
            }
        }
        return found;
    }
    
    public boolean validateNumber(String numberInput) {
        return numberInput.matches(numberRegex);
    }
    
    public boolean validateIp(String ipInput) {
        return ipInput.matches(ipRegex);
    }
    
    public boolean validateSsn (String ssnInput) {
        return ssnInput.matches(ssnRegex);
    }

    public boolean validateDate (String dateInput) {
        return dateInput.matches(dateRegex);
    }
    
    public boolean validateName(String inputName) {
        return inputName.matches(nameRegex);
    }
    
    public boolean validateEmail(String emailStr) {
        Matcher matcher = EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }
    
    public boolean validatePhone(String phoneNumberVerify) {
        return String.valueOf(phoneNumberVerify).matches(phoneRegex);
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }
    
    public BufferedImage getImage() {
        return img;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public String getPersonFaxNumber() {
        return personFaxNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getSsnUser() {
        return ssnUser;
    }

    public String getMedicalNumber() {
        return medicalNumber;
    }

    public String getHealthPlanNumber() {
        return healthPlanNumber;
    }
    
    public String getLinkedInUsername() {
        return linkedinUrl.substring(linkedInDomain.length());
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getDeviceIdentifiers() {
        return deviceIdentifiers;
    }

    public String getLinkedinUrl() {
        return linkedinUrl;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    public void setPersonFaxNumber(String personFaxNumber) {
        this.personFaxNumber = personFaxNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setSsnUser(String ssnUser) {
        this.ssnUser = ssnUser;
    }

    public void setMedicalNumber(String medicalNumber) {
        this.medicalNumber = medicalNumber;
    }

    public void setHealthPlanNumber(String healthPlanNumber) {
        this.healthPlanNumber = healthPlanNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setDeviceIdentifiers(String deviceIdentifiers) {
        this.deviceIdentifiers = deviceIdentifiers;
    }

    public void setLinkedinUrl(String linkedinUsername) {
        this.linkedinUrl = linkedInDomain + linkedinUsername;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}
