/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.Appointment.Appointment;
import java.util.ArrayList;

/**
 *
 * @author tendusmac
 */
public class AppointmentHistory {
    
    private ArrayList<Appointment> appointmenthistory;

    public AppointmentHistory() {
        this.appointmenthistory = new ArrayList();
    }

    public ArrayList<Appointment> getAppointmenthistory() {
        return appointmenthistory;
    }

    public void setAppointmenthistory(ArrayList<Appointment> appointmenthistory) {
        this.appointmenthistory = appointmenthistory;
    }
    
    
    
    
    
}
