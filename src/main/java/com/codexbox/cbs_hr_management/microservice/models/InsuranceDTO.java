package com.codexbox.cbs_hr_management.microservice.models;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class InsuranceDTO {
    private Integer insuranceId;
    private String insuranceDetails;
}
