package com.codexbox.payroll.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class PaySlip {


    @Id
    private int noofworkingdays;

    private  int noofdays;

    private  int calctc;



}
