package com.codexbox.cbs.hrmanagement.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="insurance")

public class InsuranceEntity {
    @Id
    @Column(name = "insurance_id")
    private Integer insuranceId;

    @Column(name = "insurance_details")
    private String insuranceDetails;

}
