/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.Role.ClinicAdmin;
import Business.Role.clinicOfficer;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author sreej
 */
public class ClinicAdminDirectory {
    private ArrayList<ClinicAdmin> ClinicAdminDirectory;
    private HashMap<String,ClinicAdmin> ClinicAdminMap;

    public ClinicAdminDirectory() {
        this.ClinicAdminDirectory = new ArrayList<>();
        this.ClinicAdminMap = new HashMap<>();
    }

    public ArrayList<ClinicAdmin> getClinicAdminDirectory() {
        return ClinicAdminDirectory;
    }

    public void setClinicAdminDirectory(ArrayList<ClinicAdmin> ClinicAdminDirectory) {
        this.ClinicAdminDirectory = ClinicAdminDirectory;
    }

    public HashMap<String, ClinicAdmin> getClinicAdminMap() {
        return ClinicAdminMap;
    }

    public void setClinicAdminMap(HashMap<String, ClinicAdmin> ClinicAdminMap) {
        this.ClinicAdminMap = ClinicAdminMap;
    }
    
    public void addClinicAdmin(ClinicAdmin e){
        ClinicAdminDirectory.add(e);
        ClinicAdminMap.put(e.getEmailId(),e);
    }
    
    public void removeClinicAdmin(ClinicAdmin cObj){
        ClinicAdminDirectory.remove(cObj);
        ClinicAdminMap.remove(cObj.getEmailId());
    }
    
}
