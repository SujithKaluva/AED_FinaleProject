/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.Role.SalesPerson;
import java.util.*;

/**
 *
 * @author sreej
 */
public class SalesPersonDirectory {

    private ArrayList<SalesPerson> salesPersonDirectory;
    private HashMap<String, SalesPerson> salesPersonMap;

    public SalesPersonDirectory() {
        this.salesPersonDirectory = new ArrayList<>();
        this.salesPersonMap = new HashMap<>();
    }

    public ArrayList<SalesPerson> getSalesPersonDirectory() {
        return salesPersonDirectory;
    }

    public void setSalesPersonDirectory(ArrayList<SalesPerson> salesPersonDirectory) {
        this.salesPersonDirectory = salesPersonDirectory;
    }

    public HashMap<String, SalesPerson> getSalesPersonMap() {
        return salesPersonMap;
    }

    public void setSalesPersonMap(HashMap<String, SalesPerson> salesPersonMap) {
        this.salesPersonMap = salesPersonMap;
    }
    
    public void addSalesPerson(SalesPerson spObj){
        this.salesPersonDirectory.add(spObj);
        this.salesPersonMap.put(spObj.getEmailId(), spObj);
    }

    public void removeSalesPerson(SalesPerson spObj){
        this.salesPersonDirectory.remove(spObj);
        this.salesPersonMap.remove(spObj.getEmailId());
    }
}
