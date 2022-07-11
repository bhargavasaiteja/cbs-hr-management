package com.codexbox.employeeIdcreation.users.entities;

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
    private Integer id;
    @Column(name="company_mobile_status")
    private String companyMobileStatus;
}
