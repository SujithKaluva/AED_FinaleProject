/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Clinic;

import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem.Ecosystem;

/**
 *
 * @author tendusmac
 */
public class Clinic {
    
    private String clinicName;
    private String clinicAddress;
    private String clinicId;
    private long clinicPhoneNumber;
    private static int clinicadmincounter=1;
    DB4OUtil db4oUtil = DB4OUtil.getInstance();
    Ecosystem ecoSystem = Ecosystem.getInstance();

    public Clinic(String clinicName, String clinicAddress, long clinicPhoneNumber) {
        this.clinicName = clinicName;
        this.clinicAddress = clinicAddress;
        this.clinicId = "clinicId_"+this.clinicadmincounter;
        this.clinicPhoneNumber = clinicPhoneNumber;
        clinicadmincounter++;
        ecoSystem.clinicdirectory.addClinic(this);
        //db4oUtil.storeSystem(ecoSystem);
        
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getClinicAddress() {
        return clinicAddress;
    }

    public void setClinicAddress(String clinicAddress) {
        this.clinicAddress = clinicAddress;
    }

    public String getClinicId() {
        return clinicId;
    }

    public void setClinicId(String clinicId) {
        this.clinicId = clinicId;
    }

    public long getClinicPhoneNumber() {
        return clinicPhoneNumber;
    }

    public void setClinicPhoneNumber(long clinicPhoneNumber) {
        this.clinicPhoneNumber = clinicPhoneNumber;
    }
    
}
