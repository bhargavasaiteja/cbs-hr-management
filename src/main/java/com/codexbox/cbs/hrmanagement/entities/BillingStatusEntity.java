package com.codexbox.cbs.hrmanagement.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "billing_status")
public class BillingStatusEntity {
    @Id
    @Column(name = "billing_id")
    private Integer projectId;

    @Column(name = "billing_status")
    private String projectStatus;
}
