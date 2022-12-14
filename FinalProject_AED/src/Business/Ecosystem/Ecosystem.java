/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Ecosystem;

import Business.Data.*;
import Business.Location.GoogleMapsLocation;
import PasswordEncryption.PasswordManager;
import java.util.*;

/**
 *
 * @author tendusmac
 */
public class Ecosystem {

    public static Ecosystem system;
    public ClinicAdminDirectory clinicAdminDirectory;
    public EnterpriseDirectory enterpriseDirectory;
    public SalesPersonDirectory salesPersonDirectory;
    public VaccineDirectory vaccineDirectory;
    public VolunteerDirectory volunteerDirectory;
    public clinicDirectory clinicdirectory;
    public clinicOfficerDirectory clinicofficerdirectory;
    public diseaseDirectory diseasedirectory;
    public patientDirectory patientdirectory;
    public PasswordManager passwordManager;
    public FinanceAdminDirectory financeAdminDirectory;
    public SalesAdminDirectory salesAdminDirectory;
    public ResearchScientistDirectory researchScientistDirectory;
    private ArrayList<String> vaccineComboList;
    public VaccineDetailsDirectory vaccineDetailsDirectory;
    public GoogleMapsLocation gMapsLocation;
    public AppointmentHistory appointmenthistory;
    public OrdersDirectory orderDirectory;
    public ManufacturerCatalog manufacturerCatalog;
    public EnterpriseAdminDirectory enterpriseAdminDirectory;
    public clinicProviderDirectory clinicProviderDirectory;

    public Ecosystem() {
        clinicAdminDirectory = new ClinicAdminDirectory();
        enterpriseDirectory = new EnterpriseDirectory();
        salesPersonDirectory = new SalesPersonDirectory();
        vaccineDirectory = new VaccineDirectory();
        volunteerDirectory = new VolunteerDirectory();
        clinicdirectory = new clinicDirectory();
        clinicofficerdirectory = new clinicOfficerDirectory();
        diseasedirectory = new diseaseDirectory();
        patientdirectory = new patientDirectory();
        passwordManager = new PasswordManager();
        financeAdminDirectory = new FinanceAdminDirectory();
        salesAdminDirectory = new SalesAdminDirectory();
        researchScientistDirectory = new ResearchScientistDirectory();
        vaccineComboList = new ArrayList<String>();
        vaccineDetailsDirectory = new VaccineDetailsDirectory();
        gMapsLocation = new GoogleMapsLocation();
        appointmenthistory = new AppointmentHistory();
        orderDirectory = new OrdersDirectory();
        manufacturerCatalog = new ManufacturerCatalog();
        enterpriseAdminDirectory = new EnterpriseAdminDirectory();
        clinicProviderDirectory = new clinicProviderDirectory();
    }

    public static Ecosystem getSystem() {
        return system;
    }

    public clinicProviderDirectory getClinicProviderDirectory() {
        return clinicProviderDirectory;
    }

    public void setClinicProviderDirectory(clinicProviderDirectory clinicProviderDirectory) {
        this.clinicProviderDirectory = clinicProviderDirectory;
    }

    public EnterpriseAdminDirectory getEnterpriseAdminDirectory() {
        return enterpriseAdminDirectory;
    }

    public void setEnterpriseAdminDirectory(EnterpriseAdminDirectory enterpriseAdminDirectory) {
        this.enterpriseAdminDirectory = enterpriseAdminDirectory;
    }

    public OrdersDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrdersDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    public ManufacturerCatalog getManufacturerCatalog() {
        return manufacturerCatalog;
    }

    public void setManufacturerCatalog(ManufacturerCatalog manufacturerCatalog) {
        this.manufacturerCatalog = manufacturerCatalog;
    }

    public AppointmentHistory getAppointmenthistory() {
        return appointmenthistory;
    }

    public void setAppointmenthistory(AppointmentHistory appointmenthistory) {
        this.appointmenthistory = appointmenthistory;
    }

    public GoogleMapsLocation getgMapsLocation() {
        return gMapsLocation;
    }

    public void setgMapsLocation(GoogleMapsLocation gMapsLocation) {
        this.gMapsLocation = gMapsLocation;
    }

    public FinanceAdminDirectory getFinanceAdminDirectory() {
        return financeAdminDirectory;
    }

    public void setFinanceAdminDirectory(FinanceAdminDirectory financeAdminDirectory) {
        this.financeAdminDirectory = financeAdminDirectory;
    }

    public SalesAdminDirectory getSalesAdminDirectory() {
        return salesAdminDirectory;
    }

    public void setSalesAdminDirectory(SalesAdminDirectory salesAdminDirectory) {
        this.salesAdminDirectory = salesAdminDirectory;
    }

    public ResearchScientistDirectory getResearchScientistDirectory() {
        return researchScientistDirectory;
    }

    public void setResearchScientistDirectory(ResearchScientistDirectory researchScientistDirectory) {
        this.researchScientistDirectory = researchScientistDirectory;
    }

    public ArrayList<String> getVaccineComboList() {
        return vaccineComboList;
    }

    public void setVaccineComboList(ArrayList<String> vaccineComboList) {
        this.vaccineComboList = vaccineComboList;
    }

    public VaccineDetailsDirectory getVaccineDetailsDirectory() {
        return vaccineDetailsDirectory;
    }

    public void setVaccineDetailsDirectory(VaccineDetailsDirectory vaccineDetailsDirectory) {
        this.vaccineDetailsDirectory = vaccineDetailsDirectory;
    }

    public ArrayList<String> getVaccineList() {
        return vaccineComboList;
    }

    public void setVaccineList(ArrayList<String> vaccineList) {
        this.vaccineComboList = vaccineList;
    }

    public ClinicAdminDirectory getClinicAdminDirectory() {
        return clinicAdminDirectory;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public SalesPersonDirectory getSalesPersonDirectory() {
        return salesPersonDirectory;
    }

    public VaccineDirectory getVaccineDirectory() {
        return vaccineDirectory;
    }

    public VolunteerDirectory getVolunteerDirectory() {
        return volunteerDirectory;
    }

    public clinicDirectory getClinicdirectory() {
        return clinicdirectory;
    }

    public clinicOfficerDirectory getClinicofficerdirectory() {
        return clinicofficerdirectory;
    }

    public diseaseDirectory getDiseasedirectory() {
        return diseasedirectory;
    }

    public patientDirectory getPatientdirectory() {
        return patientdirectory;
    }

    public PasswordManager getPasswordManager() {
        return passwordManager;
    }

    public static Ecosystem getInstance() {
        if (system == null) {
            system = new Ecosystem();
            //system.Configure();
            return system;
        }
        return system;
    }

    public static void setInstance(Ecosystem sys) {
        system = sys;
    }

}
