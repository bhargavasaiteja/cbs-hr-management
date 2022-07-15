package com.codexbox.cbs.hrmanagement.entities;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name="payroll")
@Data
public class PaySlipEntity {
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
    @Override
    public String toString() {
        return String.format("Customer[id=%d,'noOfWorkingDays=%d, noOfDaysPresent=%d, ctc=%d,'month=%s']", id, noOfWorkingDays, noOfDaysPresent, ctc, month);
    }
  }