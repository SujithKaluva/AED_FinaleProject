/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.disease;

/**
 *
 * @author tendusmac
 */
public class Disease {
    
    private String diseaseCode;
    private String diseaseName;
    private String diseaseSymptoms;

    public Disease(String diseaseCode, String diseaseName, String diseaseSymptoms) {
        this.diseaseCode = diseaseCode;
        this.diseaseName = diseaseName;
        this.diseaseSymptoms = diseaseSymptoms;
    }

    public String getDiseaseCode() {
        return diseaseCode;
    }

    public void setDiseaseCode(String diseaseCode) {
        this.diseaseCode = diseaseCode;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getDiseaseSymptoms() {
        return diseaseSymptoms;
    }

    public void setDiseaseSymptoms(String diseaseSymptoms) {
        this.diseaseSymptoms = diseaseSymptoms;
    }
      
    
}
