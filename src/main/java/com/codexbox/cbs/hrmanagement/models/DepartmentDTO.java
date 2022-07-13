package com.codexbox.cbs.hrmanagement.models;
import lombok.Data;
import org.springframework.context.annotation.Configuration;
@Data
@Configuration
public class DepartmentDTO {
    private  Integer departmentId;
    private String departmentName;
}

