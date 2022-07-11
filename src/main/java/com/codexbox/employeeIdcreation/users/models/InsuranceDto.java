package com.codexbox.employeeIdcreation.users.models;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class InsuranceDto implements java.io.Serializable{
    private Integer id;
    private String insuranceDetails;
}
