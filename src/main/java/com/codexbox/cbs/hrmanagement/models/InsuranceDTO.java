package com.codexbox.cbs.hrmanagement.models;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class InsuranceDTO {
    private Integer insuranceId;
    private String insuranceDetails;
}
