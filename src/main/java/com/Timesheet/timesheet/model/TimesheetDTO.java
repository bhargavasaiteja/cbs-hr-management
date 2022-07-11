package com.Timesheet.timesheet.model;


import lombok.Data;

@Data
public class TimesheetDTO {


    private  Integer empId;

    private String loginTime;

    private String logoutime;

    private Long totalHoursInWeek;

    private Long totalHoursInMonth;

    private Long numberOfworkingDaysInaWeek;

    private String holidaysOrClientCalender;

    private String leavesManagement;


}
