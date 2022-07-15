package com.codexbox.cbs.hrmanagement.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Entity
@Table(name="company_mobile")
public class CompanyMobileEntity {

    @Id
    @Column(name = "company_mobile_id")
    private Integer companyMobileId;

    @Column(name = "company_mobile_status")
    private String companyMobileStatus;
}