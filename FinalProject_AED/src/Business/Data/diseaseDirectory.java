/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.disease.Disease;
import java.util.ArrayList;

/**
 *
 * @author tendusmac
 */
public class diseaseDirectory {
    
    private ArrayList<Disease> dieasedirectory;

    public diseaseDirectory() {
        this.dieasedirectory = new ArrayList();
    }

    public ArrayList<Disease> getDieasedirectory() {
        return dieasedirectory;
    }

    public void setDieasedirectory(ArrayList<Disease> dieasedirectory) {
        this.dieasedirectory = dieasedirectory;
    }
    
    
    
}
