/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Clinic.Clinic;
import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem.Ecosystem;
import Business.Person.Person;
import Mail.SMTPMail;
import PasswordEncryption.PasswordEncryption;
import java.util.Date;

/**
 *
 * @author sreej
 */
public class Volunteer extends Person {

    private String volunteerId;
    private static int vidCounter = 1;
    private String password;
    private Clinic clinic;
    Ecosystem ecoSystem = Ecosystem.getInstance();
//    DB4OUtil db4oUtil = DB4OUtil.getInstance();

    public Volunteer(String password, String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, Clinic clinic, String location) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber, location);
        this.volunteerId = "v_" + this.vidCounter;
        this.vidCounter++;
        this.clinic = clinic;
        this.password = PasswordEncryption.getEncryptedPassword(password);
        ecoSystem.getVolunteerDirectory().addVolunteer(this);
        ecoSystem.passwordManager.addPassword("Volunteer", emailId, this.password);
        SMTPMail.sendEmailMessage(emailId, "Registration Successful!", getEmailBody(password));
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public String getVolunteerId() {
        return volunteerId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = PasswordEncryption.getEncryptedPassword(password);
        ecoSystem.passwordManager.addPassword("Sales Person", this.getEmailId(), this.password);
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
