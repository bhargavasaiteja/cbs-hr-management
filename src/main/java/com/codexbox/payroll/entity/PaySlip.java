package com.codexbox.payroll.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="payroll")
@Data
public class PaySlip {
    @Id
    @Column(name="no_of_working_days")
    private Integer noofworkingdays;
    @Column(name="no_of_days")
    private Integer noofdays;
    @Column(name="calctc")
    private Integer calctc;
    @Column(name="id")
    private Integer id;

  }