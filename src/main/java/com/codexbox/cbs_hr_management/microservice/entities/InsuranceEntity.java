package com.codexbox.cbs_hr_management.microservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="insurance")

public class InsuranceEntity {

    @Id
    @Column(name = "insurance_id")
    private Integer insuranceId;
    @Column(name = "insurance_details")
    private String insuranceDetails;

    public Integer getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(Integer insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getInsuranceDetails() {
        return insuranceDetails;
    }

    public void setInsuranceDetails(String insuranceDetails) {
        this.insuranceDetails = insuranceDetails;
    }
}
