package com.codexbox.cbs_hr_management.microservice.models;

import lombok.Data;

import java.util.Date;
@Data
public class EmpDTO {
    private Integer empId;
    private String experience;
    private String personalEmailId;
    private Integer mobileNumber;
    private String workEmailId;
    private String currentCtc;
    private String offeredCtc;
    private Date doj;
    private String systemAllocated;
    private String reportingManager;
    private String clientName;
    private Integer clientCode;
    private String shiftTimings;
    private String shiftAllowance;
    private String workLocation;
    private String locationAllowance;
    private BankDTO bankDTO;
    private Long bankUserId;
    public void setBankUserId(BankDTO bankDTO){
        this.bankUserId = bankDTO.getBankUserId();
    }


}
