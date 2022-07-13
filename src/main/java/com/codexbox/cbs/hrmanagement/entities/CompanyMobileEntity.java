package com.codexbox.cbs.hrmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="company_mobile")
public class CompanyMobileEntity {

    @Id
    @Column(name = "company_mobile_id")
    private Integer companyMobileId;
    @Column(name="company_mobile_status")
    private String companyMobileStatus;

    public Integer getCompanyMobileId() {
        return companyMobileId;
    }

    public void setCompanyMobileId(Integer companyMobileId) {
        this.companyMobileId = companyMobileId;
    }

    public String getCompanyMobileStatus() {
        return companyMobileStatus;
    }

    public void setCompanyMobileStatus(String companyMobileStatus) {
        this.companyMobileStatus = companyMobileStatus;
    }
}
