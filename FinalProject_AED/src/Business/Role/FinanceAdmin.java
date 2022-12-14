/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem.Ecosystem;
import Business.Manufacturer.Manufacturer;
import Business.Person.Person;
import Mail.SMTPMail;
import PasswordEncryption.PasswordEncryption;
import java.util.Date;

/**
 *
 * @author sujithkaluva
 */
public class FinanceAdmin extends Person {
    
    public static int finCounter = 1;
    private String financeAdminId;
    private String password;
    Manufacturer manufacturer;
    Ecosystem ecoSystem = Ecosystem.getInstance();
    DB4OUtil db4oUtil = DB4OUtil.getInstance();
    
    public FinanceAdmin(String password, String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, Manufacturer manufacturer, String location) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber,location);
        financeAdminId = "financeAdmin_"+finCounter;
        finCounter++;
        this.manufacturer = manufacturer;
        this.password = PasswordEncryption.getEncryptedPassword(password);
        ecoSystem.getFinanceAdminDirectory().addFinanceAdmin(this);
         ecoSystem.passwordManager.addPassword("Finance Admin", emailId, this.password);
        SMTPMail.sendEmailMessage(emailId, "Registration Successful!", getEmailBody(password));
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getFinanceAdminId() {
        return financeAdminId;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = PasswordEncryption.getEncryptedPassword(password);
        ecoSystem.passwordManager.addPassword("Finance Admin", this.getEmailId(), this.password);
    }

    public String getEmailBody(String password) {
        String body = "Hello " + this.getFirstName() + " " + this.getLastName() + ",\n\n";
        body += "Your Profile has been successfully created as a Finance Admin in Vaccine Management System!\n\n";
        body += "Please use your credentials to login into the system.\n\n";
        body += "Username : " + this.getEmailId() + "\n";
        body += "Password : " + password + "\n\n";
        body += "Thanks,\nVaccine Management System.";
        return body;
    }
}
