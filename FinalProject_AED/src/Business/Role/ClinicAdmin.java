/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Clinic.Clinic;
import Business.Ecosystem.Ecosystem;
import Business.Person.Person;
import Mail.SMTPMail;
import PasswordEncryption.PasswordEncryption;
import java.util.Date;

/**
 *
 * @author sreej
 */
public class ClinicAdmin extends Person {

    Ecosystem ecoSystem = Ecosystem.getInstance();

    private String clinicId;
    private static int vidCounter = 1;
    private String password;
    private Clinic clinic;

    public ClinicAdmin(String Password, String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, Clinic clinic, String location) {

        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber,location);
        this.clinicId = "ca_" + this.vidCounter + 1;
        this.vidCounter++;
        this.password = PasswordEncryption.getEncryptedPassword(Password);
        this.clinic = clinic;

        ecoSystem.clinicAdminDirectory.addClinicAdmin(this);
        ecoSystem.passwordManager.addPassword("Clinic Admin", emailId, this.password);
        SMTPMail.sendEmailMessage(emailId, "Registration Successful!", getEmailBody(Password));

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = PasswordEncryption.getEncryptedPassword(password);
        ecoSystem.passwordManager.addPassword("Clinic Admin", this.getEmailId(), this.password);
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public String getClinicId() {
        return clinicId;
    }
    
    public String getEmailBody(String password) {
        String body = "Hello " + this.getFirstName() + " " + this.getLastName() + ",\n\n";
        body += "Your Profile has been successfully created as a Volunteer in Vaccine Management System!\n\n";
        body += "Please use your credentials to login into the system.\n\n";
        body += "Username : " + this.getEmailId() + "\n";
        body += "Password : " + password + "\n\n";
        body += "Thanks,\nVaccine Management System.";
        return body;
    }

}
