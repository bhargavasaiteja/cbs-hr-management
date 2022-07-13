package com.codexbox.cbs_onboarding_formalities.models;

import lombok.Data;

@Data
public class BankDTO {
    private Long bankUserId;
    private String statusActive;
    private String notActive;
}
