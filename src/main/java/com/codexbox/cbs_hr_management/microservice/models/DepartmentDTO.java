package com.codexbox.cbs_hr_management.microservice.models;
import lombok.Data;
import org.springframework.context.annotation.Configuration;
@Data
@Configuration
public class DepartmentDTO {
    private  Integer departmentId;
    private String departmentName;
}

