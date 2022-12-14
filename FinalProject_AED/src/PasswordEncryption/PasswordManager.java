/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PasswordEncryption;

import java.util.HashMap;

/**
 *
 * @author sreej
 */
public class PasswordManager {
    HashMap<String,HashMap<String,String>> passwordManager;

    public PasswordManager() {
        this.passwordManager = new HashMap<>();
        this.passwordManager.put("Patient",new HashMap<>());
        this.passwordManager.put("Finance Admin",new HashMap<>());
        this.passwordManager.put("Sales Admin",new HashMap<>());
        this.passwordManager.put("Research Scientist",new HashMap<>());
    }
    
    public HashMap<String, HashMap<String, String>> getPasswordManager() {
        return passwordManager;
    }

    public void setPasswordManager(HashMap<String, HashMap<String, String>> passwordManager) {
        this.passwordManager = passwordManager;
    }
    
    public void addPassword(String Role, String Email, String Password){
        if(this.passwordManager.containsKey(Role)){
            this.passwordManager.get(Role).put(Email,Password);
        }
        else{
            this.passwordManager.put(Role, new HashMap<>());
            this.passwordManager.get(Role).put(Email,Password);
        }
    }
    
    public boolean isUsernameAvailable(String username,String Role){
        System.out.print(Role+"--"+username);
        if(!this.passwordManager.containsKey(Role)) return true;
        return !this.passwordManager.get(Role).containsKey(username);
    }
    
    public void removePassword(String Role,String username){
        if(this.passwordManager.get(Role).containsKey(username))
            this.passwordManager.get(Role).remove(username);;
    }
}
