package com.codexbox.cbs_hr_management.microservice.models;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class ProjectDTO {

private Integer statusId;
private String statusName;

}
