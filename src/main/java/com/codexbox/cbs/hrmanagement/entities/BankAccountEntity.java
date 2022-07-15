package com.codexbox.cbs.hrmanagement.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "bank_status")
public class BankAccountEntity {
    @Id
    @Column(name = "bank_user_id")
    private Long bankUserId;

    @Column(name = "status_active")
    private String statusActive;

    @Column(name = "not_active")
    private String notActive;

}
