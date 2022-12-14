/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.vaccine;

import Business.Ecosystem.Ecosystem;
import Business.Manufacturer.Manufacturer;
import Business.disease.Disease;

/**
 *
 * @author sreej
 */
public class Vaccine {
    
    Ecosystem ecosystem = Ecosystem.getInstance();
    
    String vcode;
    String name;
    int doses;
    int maxprice;
    int minprice;
    int targetprice;
    Disease d;
    Manufacturer manufacturer;

    public Vaccine(String vcode, String name, int doses, int maxprice, int minprice, int targetprice, Disease d, Manufacturer man) {
        this.vcode = vcode;
        this.name = name;
        this.doses = doses;
        this.maxprice = maxprice;
        this.minprice = minprice;
        this.targetprice = targetprice;
        this.d = d;
        this.manufacturer = man;
        ecosystem.getVaccineDirectory().getVaccineDirectory().add(this);
    }

    public Disease getD() {
        return d;
    }

    public void setD(Disease d) {
        this.d = d;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getVcode() {
        return vcode;
    }

    public void setVcode(String vcode) {
        this.vcode = vcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoses() {
        return doses;
    }

    public void setDoses(int doses) {
        this.doses = doses;
    }

    public int getMaxprice() {
        return maxprice;
    }

    public void setMaxprice(int maxprice) {
        this.maxprice = maxprice;
    }

    public int getMinprice() {
        return minprice;
    }

    public void setMinprice(int minprice) {
        this.minprice = minprice;
    }

    public int getTargetprice() {
        return targetprice;
    }

    public void setTargetprice(int targetprice) {
        this.targetprice = targetprice;
    }
    
    
    
}
