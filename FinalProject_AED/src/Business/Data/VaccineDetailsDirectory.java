/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.vaccine.Vaccine;
import Business.vaccine.VaccineDetails;
import java.util.ArrayList;

/**
 *
 * @author sreej
 */
public class VaccineDetailsDirectory {
    
    private ArrayList<VaccineDetails> vaccineDetailsDirectory;

    public VaccineDetailsDirectory() {
        this.vaccineDetailsDirectory = new ArrayList<>();
    }

    public ArrayList<VaccineDetails> getVaccineDetailsDirectory() {
        return vaccineDetailsDirectory;
    }

    public void setVaccineDirectory(ArrayList<VaccineDetails> vaccineDirectory) {
        this.vaccineDetailsDirectory = vaccineDetailsDirectory;
    }
     public void addVaccineDetails(VaccineDetails f){
        vaccineDetailsDirectory.add(f);
    }
    
    
}
