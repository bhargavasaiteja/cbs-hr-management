package com.codexbox.employeeIdcreation.users.entities;

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
    private Integer id;
    @Column(name = "insurance_details")
    private String insuranceDetails;
}
