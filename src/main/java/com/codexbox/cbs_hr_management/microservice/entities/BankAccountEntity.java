package com.codexbox.cbs_hr_management.microservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bank_status")
public class BankAccountEntity {
    @Id
    @Column(name = "bank_user_id")
    private Long bankUserId;
    @Column(name="status_active")
    private  String statusActive;
    @Column(name = "not_active")
    private  String notActive;



    public Long getBankUserId() {
        return bankUserId;
    }

    public void setBankUserId(Long bankUserId) {
        this.bankUserId = bankUserId;
    }

    public String getStatusActive() {
        return statusActive;
    }

    public void setStatusActive(String statusActive) {
        this.statusActive = statusActive;
    }

    public String getNotActive() {
        return notActive;
    }

    public void setNotActive(String notActive) {
        this.notActive = notActive;
    }
}
