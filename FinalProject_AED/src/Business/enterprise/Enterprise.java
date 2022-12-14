/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.enterprise;
import Business.Ecosystem.Ecosystem;
import java.util.*;

/**
 *
 * @author tendusmac
 */
public class Enterprise {
    
    private String companyName;
    private Date companyEstDate;
    private String companyAddress;
    private String companyId;
    public static int companyCounter = 1;
    Ecosystem ecosystem = Ecosystem.getInstance();

    public Enterprise(String companyName, Date companyEstDate,String companyAddress) {
        this.companyName = companyName;
        this.companyEstDate = companyEstDate;
        companyId = "Company"+companyCounter;
        this.companyAddress=companyAddress;
        companyCounter++;
        ecosystem.getEnterpriseDirectory().getEnterprisedirectory().add(this);
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getCompanyEstDate() {
        return companyEstDate;
    }

    public void setCompanyEstDate(Date companyEstDate) {
        this.companyEstDate = companyEstDate;
    }
    
    
}
