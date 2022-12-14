/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author tendusmac
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterprisedirectory;

    public EnterpriseDirectory() {
        this.enterprisedirectory = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterprisedirectory() {
        return enterprisedirectory;
    }

    public void setEnterprisedirectory(ArrayList<Enterprise> enterprisedirectory) {
        this.enterprisedirectory = enterprisedirectory;
    }

}
