/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.Role.ClinicAdmin;
import Business.Role.FinanceAdmin;
import java.util.*;

/**
 *
 * @author sreej
 */
public class FinanceAdminDirectory {

    private ArrayList<FinanceAdmin> FinanceAdminDirectory;
    private HashMap<String, FinanceAdmin> FinanceAdminMap;

    public FinanceAdminDirectory() {
        this.FinanceAdminDirectory = new ArrayList<>();
        this.FinanceAdminMap = new HashMap<>();
    }

    public ArrayList<FinanceAdmin> getFinanceAdminDirectory() {
        return FinanceAdminDirectory;
    }

    public void setFinanceAdminDirectory(ArrayList<FinanceAdmin> FinanceAdminDirectory) {
        this.FinanceAdminDirectory = FinanceAdminDirectory;
    }

    public HashMap<String, FinanceAdmin> getFinanceAdminMap() {
        return FinanceAdminMap;
    }

    public void setFinanceAdminMap(HashMap<String, FinanceAdmin> FinanceAdminMap) {
        this.FinanceAdminMap = FinanceAdminMap;
    }

    public void addFinanceAdmin(FinanceAdmin f) {
        this.FinanceAdminDirectory.add(f);
        this.FinanceAdminMap.put(f.getEmailId(), f); 
    }
    
    public void removeFinanceAdmin(FinanceAdmin fObj){
        this.FinanceAdminDirectory.remove(fObj);
        this.FinanceAdminMap.remove(fObj.getEmailId());
    }

}
