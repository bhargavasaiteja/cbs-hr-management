package com.codexbox.cbs.hrmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="education_details")
public class Education {
    @Id
    private Integer id;

    @Column(name="ssc_Percentage")
    private Float sscPercentage;

    @Column(name="intermediate_Percentage")
    private Float intermediatePercentage;

    @Column(name="intermediate_specialization")
    private String intermediateSpecialization;

    @Column(name="UG_percentage")
    private Float ugPercentage;

    @Column(name="UG_specialization")
    private String ugSpecialization;

    @Column(name="PG_percentage")
    private Float pgPercentage;

    @Column(name="PG_specialization")
    private String pgSpecialization;

    @Column(name="Dr_percentage")
    private Float drPercentage;

    @Column(name="Dr_specialization")
    private String drSpecialization;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getSscPercentage() {
        return sscPercentage;
    }

    public void setSscPercentage(Float sscPercentage) {
        this.sscPercentage = sscPercentage;
    }

    public Float getIntermediatePercentage() {
        return intermediatePercentage;
    }

    public void setIntermediatePercentage(Float intermediatePercentage) {
        this.intermediatePercentage = intermediatePercentage;
    }

    public String getIntermediateSpecialization() {
        return intermediateSpecialization;
    }

    public void setIntermediateSpecialization(String intermediateSpecialization) {
        this.intermediateSpecialization = intermediateSpecialization;
    }

    public Float getUgPercentage() {
        return ugPercentage;
    }

    public void setUgPercentage(Float ugPercentage) {
        this.ugPercentage = ugPercentage;
    }

    public String getUgSpecialization() {
        return ugSpecialization;
    }

    public void setUgSpecialization(String ugSpecialization) {
        this.ugSpecialization = ugSpecialization;
    }

    public Float getPgPercentage() {
        return pgPercentage;
    }

    public void setPgPercentage(Float pgPercentage) {
        this.pgPercentage = pgPercentage;
    }

    public String getPgSpecialization() {
        return pgSpecialization;
    }

    public void setPgSpecialization(String pgSpecialization) {
        this.pgSpecialization = pgSpecialization;
    }

    public Float getDrPercentage() {
        return drPercentage;
    }

    public void setDrPercentage(Float drPercentage) {
        this.drPercentage = drPercentage;
    }

    public String getDrSpecialization() {
        return drSpecialization;
    }

    public void setDrSpecialization(String drSpecialization) {
        this.drSpecialization = drSpecialization;
    }
}
