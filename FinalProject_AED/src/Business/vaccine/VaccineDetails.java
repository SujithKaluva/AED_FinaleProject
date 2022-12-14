/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.vaccine;

/**
 *
 * @author sreej
 */
public class VaccineDetails {
    Vaccine vaccine;
    String vaccineId;
    String batchId;
    int availQty;

    public VaccineDetails(Vaccine vaccine, String vaccineId, String batchId, int availQty) {
        this.vaccine = vaccine;
        this.vaccineId = vaccineId;
        this.batchId = batchId;
        this.availQty = availQty;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public String getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(String vaccineId) {
        this.vaccineId = vaccineId;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public int getAvailQty() {
        return availQty;
    }

    public void setAvailQty(int availQty) {
        this.availQty = availQty;
    }
    
    
    
    
}
