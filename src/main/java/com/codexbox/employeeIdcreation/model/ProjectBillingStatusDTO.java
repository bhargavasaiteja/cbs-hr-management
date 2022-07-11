package com.codexbox.employeeIdcreation.model;
import lombok.Data;
import org.springframework.context.annotation.Configuration;
@Data
@Configuration
public class ProjectBillingStatusDTO {
    private Integer projectId;
    private String projectStatus;
}
