/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.Role.clinicProvider;
import java.util.*;

/**
 *
 * @author tendusmac
 */
public class clinicProviderDirectory {
    
    private ArrayList<clinicProvider> clinicproviderdirectory;
    private HashMap<String,clinicProvider> clinicprovidermap;

    public clinicProviderDirectory() {
        this.clinicproviderdirectory = new ArrayList<>();
        this.clinicprovidermap = new HashMap<>();
    }

    public ArrayList<clinicProvider> getClinicproviderdirectory() {
        return clinicproviderdirectory;
    }

    public void setClinicproviderdirectory(ArrayList<clinicProvider> clinicproviderdirectory) {
        this.clinicproviderdirectory = clinicproviderdirectory;
    }

    public HashMap<String, clinicProvider> getClinicprovidermap() {
        return clinicprovidermap;
    }

    public void setClinicprovidermap(HashMap<String, clinicProvider> clinicprovidermap) {
        this.clinicprovidermap = clinicprovidermap;
    }
    
    public void addClinicProvider(clinicProvider cProvider){
        this.clinicproviderdirectory.add(cProvider);
        this.clinicprovidermap.put(cProvider.getEmailId(), cProvider);
    }
    
    public void removeClinicProvider(clinicProvider cProvider){
        this.clinicproviderdirectory.remove(cProvider);
        this.clinicprovidermap.remove(cProvider.getEmailId());
    }
    
    
}
