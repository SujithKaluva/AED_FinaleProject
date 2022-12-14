/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Ecosystem;

import Business.Appointment.Appointment;
import Business.Clinic.Clinic;
import Business.Manufacturer.Manufacturer;
import Business.Orders.Orders;
import Business.Role.ClinicAdmin;
import Business.Role.EnterpriseAdmin;
import Business.Role.FinanceAdmin;
import Business.Role.Patient;
import Business.Role.ResearchScientist;
import Business.Role.SalesAdmin;
import Business.Role.SalesPerson;
import Business.Role.Volunteer;
import Business.Role.clinicOfficer;
import Business.Role.clinicProvider;
import Business.disease.Disease;
import Business.enterprise.Enterprise;
import Business.vaccine.Vaccine;
import PasswordEncryption.PasswordEncryption;
import java.util.Date;

/**
 *
 * @author sujithkaluva
 */
public class ConfigureSystem {
    
    public static Ecosystem configure(){
        Ecosystem system = Ecosystem.getInstance();
        Date d = new Date();
        Enterprise ent1 = new Enterprise("Glenmark", d, "New York");
        Manufacturer man1 = new Manufacturer("Bharat Manufacturer", "sujithkaluva25@gmail.com", ent1, null, "password");
        Disease disease1 = new Disease("dis1", "Corona", "Fever, Cold");
        Vaccine vac1 = new Vaccine("vac1", "Covi Shield", 3, 100, 80, 90, disease1, man1);
        Vaccine vac2 = new Vaccine("vac2", "Covaxine", 2, 120, 80, 90, disease1, man1);
        Clinic clinicObj = new Clinic("Clinic One","Boston",1234567890l);
        Patient pObj = new Patient("Sujith","Sujith","Kaluva",d,"sujith@gmail.com","Male",8572458702l,"42.3398067,-71.0913604");
        Volunteer vObj = new Volunteer("password", "Volunteer", "One", d, "sujithkaluva25@gmail.com", "Male", 8572458702l,clinicObj,"42.3398067,-71.0913604");
        Appointment app1 = new Appointment(disease1, vac2, clinicObj, d, pObj, "Booked", "Test", vObj, 0);
        SalesPerson salesperson1 = new SalesPerson("password", "Sales", "Person", d, "sujithkaluva25@gmail.com", "Male", 9876543210l, man1, "Boston");
        clinicOfficer clinicofficer1 = new clinicOfficer("password", "Clinic", "Officer", d, "sujith@gmail.com", "Male", 8572458702l, clinicObj, "NEU");
        clinicProvider clinicProvider1 = new clinicProvider("password", "Clinic", "Provider", d, "sujith@gmail.com", "Male", 8572458702l, "NEU");
        ClinicAdmin clinicAdmin = new ClinicAdmin("Password", "Clinic", "Admin", d, "sujith@gmail.com", "Male", 8919123821l, clinicObj, "JP");
        SalesAdmin salesAdmin = new SalesAdmin("password", "Sales", "Admin", d, "sujith@gmail.com", "Male", 8919123821l, man1, "Roxbury");
        ResearchScientist rScientist = new ResearchScientist("password", "research", "scientist", d, "sujith@gmail.com", "Male", 1234567890l, man1, "Bos");
        EnterpriseAdmin entAdmin = new EnterpriseAdmin("password", "Enterprise", "Admin", d, "sujith@gmail.com", "Male", 9876543210l, "Delhi",ent1);
        Orders ord = new Orders(clinicObj, vac2, 1, 100, salesperson1, "Booked", d, d, "test");
        FinanceAdmin fAdmin = new FinanceAdmin("password", "Finance", "Admin", d, "sujith@gmail.com", "Male", 1234567890l, man1, "H");
        return system;
    }
} 
