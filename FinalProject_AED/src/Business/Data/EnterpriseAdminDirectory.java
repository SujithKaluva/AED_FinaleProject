/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.Role.EnterpriseAdmin;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author sujithkaluva
 */
public class EnterpriseAdminDirectory {
    
    private ArrayList<EnterpriseAdmin> enterpriseAdminList;
    private HashMap<String,EnterpriseAdmin> enterpriseAdminMap;
    
    public EnterpriseAdminDirectory(){
        enterpriseAdminList = new ArrayList<>();
        enterpriseAdminMap = new HashMap<>();
    }

    public ArrayList<EnterpriseAdmin> getEnterpriseAdminList() {
        return enterpriseAdminList;
    }

    public void setEnterpriseAdminList(ArrayList<EnterpriseAdmin> enterpriseAdminList) {
        this.enterpriseAdminList = enterpriseAdminList;
    }

    public HashMap<String, EnterpriseAdmin> getEnterpriseAdminMap() {
        return enterpriseAdminMap;
    }

    public void setEnterpriseAdminMap(HashMap<String, EnterpriseAdmin> enterpriseAdminMap) {
        this.enterpriseAdminMap = enterpriseAdminMap;
    }
    
    public void addEnterpriseAdmin(EnterpriseAdmin entAdmin){
        this.enterpriseAdminList.add(entAdmin);
        this.enterpriseAdminMap.put(entAdmin.getEmailId(),entAdmin);
    }
    
    public void removeEnterpriseAdmin(EnterpriseAdmin entAdmin){
        this.enterpriseAdminList.remove(entAdmin);
        this.enterpriseAdminMap.remove(entAdmin.getEmailId());
    }
}
