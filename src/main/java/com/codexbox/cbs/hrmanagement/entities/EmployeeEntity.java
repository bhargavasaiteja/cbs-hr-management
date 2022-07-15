package com.codexbox.cbs.hrmanagement.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "employee_details")
public class EmployeeEntity {
    @Id
    @Column(name = "emp_id")
    private Integer empId;

    private String experience;

    @Column(name = "personal_email_id")
    private String personalEmailId;

    @Column(name = "work_email_id")
    private String workEmailId;

    @Column(name = "mobile_number")
    private Integer mobileNumber;

    @Column(name = "current_ctc")
    private String currentCtc;

    @Column(name = "offered_ctc")
    private String offeredCtc;

    @Column(name = "doj")
    private Date Doj;

    @Column(name = "system_allocated")
    private String systemAllocated;

    @Column(name = "reporting_manager")
    private String reportingManager;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "client_code")
    private Integer clientCode;

    @Column(name = "shift_timings")
    private String shiftTimings;

    @Column(name = "shift_allowance")
    private String shiftAllowance;

    @Column(name = "work_location")
    private String workLocation;

    @Column(name = "location_allowance")
    private String locationAllowance;

    @Column(name = "bank_user_id")
    private Long bankUserId;
}
