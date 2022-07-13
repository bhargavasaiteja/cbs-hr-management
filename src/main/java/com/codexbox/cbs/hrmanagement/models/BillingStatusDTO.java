package com.codexbox.cbs.hrmanagement.models;
import lombok.Data;
import org.springframework.context.annotation.Configuration;
@Data
@Configuration
public class BillingStatusDTO {
    private Integer projectId;
    private String projectBillingStatus;

}