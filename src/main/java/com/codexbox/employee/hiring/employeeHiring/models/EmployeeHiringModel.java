package com.codexbox.employee.hiring.employeeHiring.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;
import java.io.Serializable;
@Data
@Configuration
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeHiringModel implements Serializable {
    private Integer profileId;
    private String zoomOrGoogleMeet;
    private String interviewerName;
    private String designation;
    private Integer status;
    private String comments;
}
