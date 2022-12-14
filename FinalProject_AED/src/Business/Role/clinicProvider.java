/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Ecosystem.Ecosystem;
import Business.Person.Person;
import Mail.SMTPMail;
import PasswordEncryption.PasswordEncryption;
import java.util.Date;

/**
 *
 * @author tendusmac
 */
public class clinicProvider extends Person {

    private String clinicproviderId;
    private static int clinicproviderCounter = 1;
    private String password;
    Ecosystem ecoSystem = Ecosystem.getInstance();

    public clinicProvider(String password,String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, String location) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber, location);
        this.clinicproviderId = "clinicproviderId_" + this.clinicproviderCounter;
        clinicproviderCounter++;
        this.password = PasswordEncryption.getEncryptedPassword(password);
        ecoSystem.getClinicProviderDirectory().addClinicProvider(this);
        ecoSystem.passwordManager.addPassword("Clinic Provider", emailId, this.password);
        SMTPMail.sendEmailMessage(emailId, "Registration Successful!", getEmailBody(password));
    }

    public String getClinicproviderId() {
        return clinicproviderId;
    }

    public void setClinicproviderId(String clinicproviderId) {
        this.clinicproviderId = clinicproviderId;
    }

    public void setPassword(String password) {
        this.password = PasswordEncryption.getEncryptedPassword(password);
        ecoSystem.passwordManager.addPassword("Sales Person", this.getEmailId(), this.password);
    }

    public String getEmailBody(String password) {
        String body = "Hello " + this.getFirstName() + " " + this.getLastName() + ",\n\n";
        body += "Your Profile has been successfully created as a Clinic Provider in Vaccine Management System!\n\n";
        body += "Please use your credentials to login into the system.\n\n";
        body += "Username : " + this.getEmailId() + "\n";
        body += "Password : " + password + "\n\n";
        body += "Thanks,\nVaccine Management System.";
        return body;
    }

}
