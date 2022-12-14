/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.Clinic.Clinic;
import java.util.ArrayList;

/**
 *
 * @author tendusmac
 */
public class clinicDirectory {
    
    private ArrayList<Clinic> clinicdirectory;

    public clinicDirectory() {
        this.clinicdirectory = new ArrayList<>();
    }

    public ArrayList<Clinic> getClinicdirectory() {
        return clinicdirectory;
    }

    public void setClinicdirectory(ArrayList<Clinic> clinicdirectory) {
        this.clinicdirectory = clinicdirectory;
    }
    
    public void addClinic(Clinic c){
        this.clinicdirectory.add(c);
    }
    
}

