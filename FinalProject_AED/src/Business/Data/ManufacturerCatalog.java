/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.Manufacturer.Manufacturer;
import java.util.*;

/**
 *
 * @author sujithkaluva
 */
public class ManufacturerCatalog {
    
    ArrayList<Manufacturer> manufacturerList;
    HashMap<String,Manufacturer> manufacturerMap;
    
    public ManufacturerCatalog(){
        manufacturerList = new ArrayList<>();
        manufacturerMap = new HashMap<>();
    }

    public ArrayList<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public void setManufacturerList(ArrayList<Manufacturer> manufacturerList) {
        this.manufacturerList = manufacturerList;
    }

    public HashMap<String, Manufacturer> getManufacturerMap() {
        return manufacturerMap;
    }

    public void setManufacturerMap(HashMap<String, Manufacturer> manufacturerMap) {
        this.manufacturerMap = manufacturerMap;
    }
    
    public void addManufacturer(Manufacturer manObj){
        this.manufacturerList.add(manObj);
        this.manufacturerMap.put(manObj.getEmailId(),manObj);
    }
    
    public void removeManufacturer(Manufacturer manObj){
        this.manufacturerList.remove(manObj);
        this.manufacturerMap.remove(manObj.getEmailId());
    }
    
    
}
