package com.codexbox.cbs_onboarding_formalities.models;


import com.codexbox.cbs_onboarding_formalities.entities.Education;
import lombok.Data;


@Data
public class EducationDTO {
    private int id;
    private float sscPercentage;
    private float IntermediatePercentage;
    private String IntermediateSpecialzation;
    private String ugPercentage;
    private String ugSpecialzation;
    private String pgPercentage;
    private String pgSpecialzation;
    private String drPercentage;
    private String drSpecialzation;

    public EducationDTO(Education education) {
        this.id =education.getId();
        this.sscPercentage = education.getSscPercentage();
        this.IntermediatePercentage = education.getIntermediatePercentage();
        this.IntermediateSpecialzation = education.getIntermediateSpecialization();
        this.ugPercentage = education.getUgPercentage();
        this.ugSpecialzation = education.getUgSpecialzation();
        this.pgPercentage = education.getPgPercentage();
        this.pgSpecialzation = education.getPgSpecialzation();
        this.drPercentage = education.getDrPercentage();
        this.drSpecialzation = education.getDrSpecialzation();
    }
}
