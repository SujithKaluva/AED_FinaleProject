/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Ecosystem.Ecosystem;
import Business.Person.Person;
import Business.enterprise.Enterprise;
import Mail.SMTPMail;
import PasswordEncryption.PasswordEncryption;
import java.util.Date;

/**
 *
 * @author sujithkaluva
 */
public class EnterpriseAdmin extends Person{
    
    public static int entAdminCounter = 1;
    private String entAdminId;
    private String password;
    private Enterprise enterprise;
    Ecosystem ecosystem = Ecosystem.getInstance();
    
    public EnterpriseAdmin(String password, String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, String location,Enterprise ent) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber,location);
        entAdminId = "entAdmin_" + entAdminCounter;
        entAdminCounter++;
        this.password = PasswordEncryption.getEncryptedPassword(password);
        ecosystem.getEnterpriseAdminDirectory().addEnterpriseAdmin(this);
        this.enterprise = ent;
        ecosystem.passwordManager.addPassword("Enterprise Admin", emailId, this.password);
        SMTPMail.sendEmailMessage(emailId, "Registration Successful!", getEmailBody(password));
    }

    public String getEntAdminId() {
        return entAdminId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = PasswordEncryption.getEncryptedPassword(password);
        ecosystem.passwordManager.addPassword("Enterprise Admin", this.getEmailId(), this.password);
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
    
    public String getEmailBody(String password) {
        String body = "Hello " + this.getFirstName() + " " + this.getLastName() + ",\n\n";
        body += "Your Profile has been successfully created as a Enterprise Admin in Vaccine Management System!\n\n";
        body += "Please use your credentials to login into the system.\n\n";
        body += "Username : " + this.getEmailId() + "\n";
        body += "Password : " + password + "\n\n";
        body += "Thanks,\nVaccine Management System.";
        return body;
    }
     
}
