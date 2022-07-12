package com.codexbox.employeeIdcreation.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Entity
@Table(name="Project")
public class ProjectEntity {
    @Id
    @Column(name="status_id")
   private Integer statusId;
    @Column(name="status_name")
    private String statusName;

    @Entity
    @Table(name="company_mobile")
    public static class CompanyMobileEntity {
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
}
