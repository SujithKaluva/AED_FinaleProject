/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.vaccine.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author sreej
 */
public class VaccineDirectory {
    private ArrayList<Vaccine> vaccineDirectory;

    public VaccineDirectory() {
        this.vaccineDirectory = new ArrayList<>();
    }

    public ArrayList<Vaccine> getVaccineDirectory() {
        return vaccineDirectory;
    }

    public void setVaccineDirectory(ArrayList<Vaccine> vaccineDirectory) {
        this.vaccineDirectory = vaccineDirectory;
    }
    
    
    
}
