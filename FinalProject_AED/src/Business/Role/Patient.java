/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem.Ecosystem;
import Business.Person.Person;
import Mail.SMTPMail;
import PasswordEncryption.PasswordEncryption;
import com.db4o.ObjectContainer;
import java.util.*;


/**
 *
 * @author tendusmac
 */
public class Patient extends Person {
    
    Ecosystem ecoSystem = Ecosystem.getInstance();
    DB4OUtil db4oUtil = DB4OUtil.getInstance();
    private String PatientId;
    public static int patientCounter=1;
    private String password;

    public Patient(String password, String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, String location) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber, location);
        this.PatientId = "patient_"+patientCounter;
        this.password = PasswordEncryption.getEncryptedPassword(password);
        patientCounter++;
        ecoSystem.patientdirectory.addPatient(this);
        ecoSystem.passwordManager.addPassword("Patient", emailId, this.password);
        SMTPMail.sendEmailMessage(emailId, "Registration Successful!", getEmailBody());
        //db4oUtil.storeSystem(ecoSystem);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        System.out.println(this.password);
        this.password = PasswordEncryption.getEncryptedPassword(password);
        System.out.println(this.password);
        ecoSystem.passwordManager.addPassword("Patient", this.getEmailId(), this.password);
    }
   
    public String getPatientId() {
        return PatientId;
    }
    
    public String getEmailBody(){
    String body = "Hello "+ this.getFirstName()+" "+ this.getLastName()+",\n\n";
    body += "Your Profile has been successfully created as a Patient in Vaccine Management System!\n\n";
    body += "Please use your credentials to login into the system.\n\n";
    body += "Thanks,\nVaccine Management System.";
    return body;
    }
    
}