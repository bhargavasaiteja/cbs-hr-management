package com.codexbox.cbs_onboarding_formalities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="education_details")
public class Education {
    @Id
    private int id;

    @Column(name="ssc_Percentage")
    private float sscPercentage;

    @Column(name="intermediate_Percentage")
    private float intermediatePercentage;

    @Column(name="intermediate_specialization")
    private String intermediateSpecialization;

    @Column(name="UG_percentage")
    private String ugPercentage;

    @Column(name="UG_specialization")
    private String ugSpecialzation;

    @Column(name="PG_percentage")
    private String pgPercentage;

    @Column(name="PG_specialization")
    private String pgSpecialzation;

    @Column(name="Dr_percentage")
    private String drPercentage;

    @Column(name="Dr_speccialization")
    private String drSpecialzation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSscPercentage() {
        return sscPercentage;
    }

    public void setSscPercentage(float sscPercentage) {
        this.sscPercentage = sscPercentage;
    }

    public float getIntermediatePercentage() {
        return intermediatePercentage;
    }

    public void setIntermediatePercentage(float intermediatePercentage) {
        this.intermediatePercentage = intermediatePercentage;
    }

    public String getIntermediateSpecialization() {
        return intermediateSpecialization;
    }

    public void setIntermediateSpecialization(String intermediateSpecialization) {
        this.intermediateSpecialization = intermediateSpecialization;
    }

    public String getUgPercentage() {
        return ugPercentage;
    }

    public void setUgPercentage(String ugPercentage) {
        this.ugPercentage = ugPercentage;
    }

    public String getUgSpecialzation() {
        return ugSpecialzation;
    }

    public void setUgSpecialzation(String ugSpecialzation) {
        this.ugSpecialzation = ugSpecialzation;
    }

    public String getPgPercentage() {
        return pgPercentage;
    }

    public void setPgPercentage(String pgPercentage) {
        this.pgPercentage = pgPercentage;
    }

    public String getPgSpecialzation() {
        return pgSpecialzation;
    }

    public void setPgSpecialzation(String pgSpecialzation) {
        this.pgSpecialzation = pgSpecialzation;
    }

    public String getDrPercentage() {
        return drPercentage;
    }

    public void setDrPercentage(String drPercentage) {
        this.drPercentage = drPercentage;
    }

    public String getDrSpecialzation() {
        return drSpecialzation;
    }

    public void setDrSpecialzation(String drSpecialzation) {
        this.drSpecialzation = drSpecialzation;
    }
}
