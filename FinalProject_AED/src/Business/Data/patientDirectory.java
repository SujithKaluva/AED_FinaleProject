/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.Ecosystem.Ecosystem;
import Business.Role.Patient;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author tendusmac
 */
public class patientDirectory {

    private ArrayList<Patient> patientdirectory;
    private HashMap<String, Patient> patientMap;

    public patientDirectory() {
        this.patientdirectory = new ArrayList<>();
        this.patientMap = new HashMap<>();
    }

    public HashMap<String, Patient> getPatientMap() {
        return patientMap;
    }

    public void setPatientMap(HashMap<String, Patient> patientMap) {
        this.patientMap = patientMap;
    }

    public ArrayList<Patient> getPatientdirectory() {
        return patientdirectory;
    }

    public void setPatientdirectory(ArrayList<Patient> patientdirectory) {
        this.patientdirectory = patientdirectory;
    }
    
    public void addPatient(Patient pObj){
        this.patientdirectory.add(pObj);
        this.patientMap.put(pObj.getEmailId(),pObj);
    }
    
    public void deletePatient(Patient pObj){
        this.patientdirectory.remove(pObj);
        this.patientMap.remove(pObj.getEmailId());
    }

}
