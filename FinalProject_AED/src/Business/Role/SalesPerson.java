/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Ecosystem.Ecosystem;
import Business.Manufacturer.Manufacturer;
import Business.Person.Person;
import Mail.SMTPMail;
import PasswordEncryption.PasswordEncryption;
import java.util.Date;

/**
 *
 * @author sreej
 */
public class SalesPerson extends Person {

    Manufacturer manufacturer;
    private String salesId;
    private static int vidCounter = 1;
    private String password;
    Ecosystem ecosystem = Ecosystem.getInstance();

    public SalesPerson(String password, String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, Manufacturer manufacturer, String location) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber, location);
        this.manufacturer = manufacturer;
        this.password = PasswordEncryption.getEncryptedPassword(password);
        this.salesId = "s_" + this.vidCounter + 1;
        this.vidCounter++;
        ecosystem.getSalesPersonDirectory().addSalesPerson(this);
        ecosystem.passwordManager.addPassword("Sales Person", emailId, this.password);
        SMTPMail.sendEmailMessage(emailId, "Registration Successful!", getEmailBody(password));
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSalesId() {
        return salesId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = PasswordEncryption.getEncryptedPassword(password);
        ecosystem.passwordManager.addPassword("Sales Person", this.getEmailId(), this.password);
    }

    public String getEmailBody(String password) {
        String body = "Hello " + this.getFirstName() + " " + this.getLastName() + ",\n\n";
        body += "Your Profile has been successfully created as a Sales Person in Vaccine Management System!\n\n";
        body += "Please use your credentials to login into the system.\n\n";
        body += "Username : " + this.getEmailId() + "\n";
        body += "Password : " + password + "\n\n";
        body += "Thanks,\nVaccine Management System.";
        return body;
    }

}
