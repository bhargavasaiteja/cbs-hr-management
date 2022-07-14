package com.codexbox.payroll.entity;


import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name="payroll")
@Data
public class PaySlip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "payroll_id")
    private long id;

    @Column(name = "no_of_working_days")
    private Integer noOfWorkingDays;

    @Column(name = "no_of_days_present")
    private Integer noOfDaysPresent;

    @Column(name = "ctc")
    private Integer ctc;

    @Column(name = "month")
    private String month;




  }