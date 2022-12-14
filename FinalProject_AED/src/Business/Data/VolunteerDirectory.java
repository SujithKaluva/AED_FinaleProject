/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.Role.Volunteer;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author sreej
 */
public class VolunteerDirectory {
    private ArrayList<Volunteer> volunteerDirectory;
    private HashMap<String,Volunteer> volunteerMap;

    public VolunteerDirectory() {
        this.volunteerDirectory = new ArrayList<>();
        this.volunteerMap = new HashMap<>();
    }

    public ArrayList<Volunteer> getVolunteerDirectory() {
        return volunteerDirectory;
    }

    public void setVolunteerDirectory(ArrayList<Volunteer> volunteerDirectory) {
        this.volunteerDirectory = volunteerDirectory;
    }

    public HashMap<String, Volunteer> getVolunteerMap() {
        return volunteerMap;
    }

    public void setVolunteerMap(HashMap<String, Volunteer> volunteerMap) {
        this.volunteerMap = volunteerMap;
    }
    
    public void addVolunteer(Volunteer vObj){
        this.volunteerDirectory.add(vObj);
        this.volunteerMap.put(vObj.getEmailId(), vObj);
    }
    
    public void removeVolunteer(Volunteer vObj){
        this.volunteerDirectory.remove(vObj);
        this.volunteerMap.remove(vObj.getEmailId());
    }
    
}
