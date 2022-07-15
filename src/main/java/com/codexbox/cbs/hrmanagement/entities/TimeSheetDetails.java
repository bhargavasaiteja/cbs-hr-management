package com.codexbox.cbs.hrmanagement.entities;


import lombok.Data;

import javax.persistence.*;
@Data
@Table(name = "hr_timesheet_details")
@Entity
public class TimeSheetDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_Id")
    private int empId;

    @Column(name = "login_time")
    private String logInTime;

    @Column(name = "logout_time")
    private String logOutTime;

    @Column(name = "number_of_working_days_in_month")
    private Long numberOfWorkingDaysInWeek;

    @Column(name = "holidays_or_client_management")
    private String holidaysOrClientCalender;

}

