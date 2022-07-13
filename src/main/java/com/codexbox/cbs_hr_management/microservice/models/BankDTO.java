package com.codexbox.cbs_hr_management.microservice.models;

import lombok.Data;

@Data
public class BankDTO {
    private Long bankUserId;
    private String statusActive;
    private String notActive;
}
