/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Appointment;

import Business.Clinic.Clinic;
import Business.Ecosystem.Ecosystem;
import Business.Role.Patient;
import Business.Role.Volunteer;
import Business.disease.Disease;
import Business.vaccine.Vaccine;
import java.util.Date;

/**
 *
 * @author tendusmac
 */
public class Appointment {
    
    private Disease disease; 
    private Vaccine vaccine;
    private Clinic clinic;
    private Date date;
    private Patient patient;
    private String appointmentstatus;
    private String comments;
    private Volunteer volunteer;
    private int price;
    private String appid;
    public static int count = 1;
    Ecosystem ecosystem = Ecosystem.getInstance();

    public Appointment(Disease disease, Vaccine vaccine, Clinic clinic, Date date, Patient patient, String appointmentstatus, String comments, Volunteer volunteer, int price) {
        this.disease = disease;
        this.vaccine = vaccine;
        this.clinic = clinic;
        this.date = date;
        this.patient = patient;
        this.appointmentstatus = appointmentstatus;
        this.comments = comments;
        this.volunteer = volunteer;
        this.price = price;
        this.appid = "a_"+count;
        count++;
        ecosystem.getAppointmenthistory().getAppointmenthistory().add(this);
    }

    public String getAppid() {
        return appid;
    }

    public String getAppointmentstatus() {
        return appointmentstatus;
    }

    public void setAppointmentstatus(String appointmentstatus) {
        this.appointmentstatus = appointmentstatus;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}

