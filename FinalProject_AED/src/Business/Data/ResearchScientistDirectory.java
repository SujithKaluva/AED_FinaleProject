/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.Role.FinanceAdmin;
import Business.Role.ResearchScientist;
import java.util.*;

/**
 *
 * @author sreej
 */
public class ResearchScientistDirectory {

    private ArrayList<ResearchScientist> ResearchScientistDirectory;
    private HashMap<String, ResearchScientist> ResearchScientistMap;

    public ResearchScientistDirectory() {
        this.ResearchScientistDirectory = new ArrayList<>();
        this.ResearchScientistMap = new HashMap<>();
    }

    public HashMap<String, ResearchScientist> getResearchScientistMap() {
        return ResearchScientistMap;
    }

    public void setResearchScientistMap(HashMap<String, ResearchScientist> ResearchScientistMap) {
        this.ResearchScientistMap = ResearchScientistMap;
    }

    public ArrayList<ResearchScientist> getResearchScientistDirectory() {
        return ResearchScientistDirectory;
    }

    public void setFinanceAdminDirectory(ArrayList<ResearchScientist> ResearchScientistDirectory) {
        this.ResearchScientistDirectory = ResearchScientistDirectory;
    }

    public void addResearchScientist(ResearchScientist f) {
        this.ResearchScientistDirectory.add(f);
        this.ResearchScientistMap.put(f.getEmailId(), f);
    }

    public void removeResearchScientist(ResearchScientist f) {
        this.ResearchScientistDirectory.remove(f);
        this.ResearchScientistMap.remove(f.getEmailId());
    }
}
