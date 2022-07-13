package com.codexbox.cbs_hr_management.microservice.models;


import com.codexbox.cbs_hr_management.microservice.entities.Education;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EducationDTO {
    private Integer id;
    private Float sscPercentage;
    private Float IntermediatePercentage;
    private String IntermediateSpecialization;
    private Float ugPercentage;
    private String ugSpecialization;
    private Float pgPercentage;
    private String pgSpecialization;
    private Float drPercentage;
    private String drSpecialization;

    public EducationDTO(Education education) {
        this.id =education.getId();
        this.sscPercentage = education.getSscPercentage();
        this.IntermediatePercentage = education.getIntermediatePercentage();
        this.IntermediateSpecialization = education.getIntermediateSpecialization();
        this.ugPercentage = education.getUgPercentage();
        this.ugSpecialization = education.getUgSpecialization();
        this.pgPercentage = education.getPgPercentage();
        this.pgSpecialization = education.getPgSpecialization();
        this.drPercentage = education.getDrPercentage();
        this.drSpecialization = education.getDrSpecialization();
    }
}
