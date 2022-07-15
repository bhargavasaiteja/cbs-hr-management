package com.codexbox.cbs.hrmanagement.models;


import lombok.Data;

@Data
public class PayslipDTO {
private Long id;
private Integer noOfWorkingDays;
private Integer noOfDaysPresent;
private Integer ctc;
private String month;
}
