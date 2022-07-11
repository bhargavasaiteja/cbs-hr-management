package com.codexbox.employeeIdcreation.model;
import lombok.Data;
import org.springframework.context.annotation.Configuration;
import java.util.Date;
@Data
@Configuration
public class EmpDTO {
    private Integer  empId ;
    private Integer  experience ;
    private String personalEmailId ;
    private String workEmailId ;
    private Long  mobileNumber ;
    private String currentCtc ;
    private String offeredCtc ;
    private Date doj ;
    private String systemAllocated ;
    private String reportingManager ;
    private Integer bankUserId ;
    private String clientName ;
    private Integer clientCode ;
    private String shiftTimings ;
    private Integer shiftAllowance ;
    private String workLocation;
    private String locationAllowance ;

}
