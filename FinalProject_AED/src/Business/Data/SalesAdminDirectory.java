/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.Role.FinanceAdmin;
import Business.Role.SalesAdmin;
import java.util.*;

/**
 *
 * @author sreej
 */
public class SalesAdminDirectory {

    private ArrayList<SalesAdmin> SalesAdminDirectory;
    private HashMap<String, SalesAdmin> salesAdminMap;

    public SalesAdminDirectory() {
        this.SalesAdminDirectory = new ArrayList<>();
        this.salesAdminMap = new HashMap<>();
    }

    public ArrayList<SalesAdmin> getSalesAdminDirectory() {
        return SalesAdminDirectory;
    }

    public void setSalesAdminDirectory(ArrayList<SalesAdmin> SalesAdminDirectory) {
        this.SalesAdminDirectory = SalesAdminDirectory;
    }

    public HashMap<String, SalesAdmin> getSalesAdminMap() {
        return salesAdminMap;
    }

    public void setSalesAdminMap(HashMap<String, SalesAdmin> salesAdminMap) {
        this.salesAdminMap = salesAdminMap;
    }

    public void addSalesAdmin(SalesAdmin sAdmin) {
        SalesAdminDirectory.add(sAdmin);
        salesAdminMap.put(sAdmin.getEmailId(), sAdmin);
    }

    public void removeSalesAdmin(SalesAdmin sAdmin) {
        SalesAdminDirectory.remove(sAdmin);
        salesAdminMap.remove(sAdmin.getEmailId());
    }
    
}
