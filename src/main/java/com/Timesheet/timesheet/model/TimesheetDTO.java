package com.Timesheet.timesheet.model;


import lombok.Data;

@Data
public class TimesheetDTO {


    private  Integer empId;

    private String logInTime;

    private String logOutTime;

    private Long numberOfWorkingDaysInWeek;

    private String holidaysOrClientCalender;




}
