package com.codexbox.payroll.model;


import lombok.Data;

@Data
public class PayslipDTO {
private Long id;
private Integer noOfWorkingDays;
private Integer noOfDaysPresent;
private Integer ctc;
private String month;
}
