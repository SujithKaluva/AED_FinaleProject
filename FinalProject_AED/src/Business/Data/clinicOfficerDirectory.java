/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.Role.clinicOfficer;
import java.util.*;

/**
 *
 * @author tendusmac
 */
public class clinicOfficerDirectory {
    
    private ArrayList<clinicOfficer> clinicofficerdirectory;
    private HashMap<String,clinicOfficer> clinicOfficerMap;

    public clinicOfficerDirectory() {
        this.clinicofficerdirectory = new ArrayList<>();
        this.clinicOfficerMap = new HashMap<>();
    }

    public ArrayList<clinicOfficer> getClinicofficerdirectory() {
        return clinicofficerdirectory;
    }

    public void setClinicofficerdirectory(ArrayList<clinicOfficer> clinicofficerdirectory) {
        this.clinicofficerdirectory = clinicofficerdirectory;
    }

    public HashMap<String, clinicOfficer> getClinicOfficerMap() {
        return clinicOfficerMap;
    }

    public void setClinicOfficerMap(HashMap<String, clinicOfficer> clinicOfficerMap) {
        this.clinicOfficerMap = clinicOfficerMap;
    }
    
    public void addOfficer(clinicOfficer cOfObj){
        this.clinicofficerdirectory.add(cOfObj);
        this.clinicOfficerMap.put(cOfObj.getEmailId(),cOfObj);
    }
    
    public void removeOfficer(clinicOfficer cOfObj){
        this.clinicofficerdirectory.remove(cOfObj);
        this.clinicOfficerMap.remove(cOfObj.getEmailId());
    }
    
    
}
