/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Person.Person;
import java.util.Date;

/**
 *
 * @author sujithkaluva
 */
public class SystemAdmin extends Person {
    
    public static int sysAdminCounter = 1;
    private String sysAdminId;
    
    public SystemAdmin(String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, String location) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber, location);
        sysAdminId = "sysAdmin_"+sysAdminCounter;
        sysAdminCounter++;
    }

    public String getSysAdminId() {
        return sysAdminId;
    }
    
    
}
