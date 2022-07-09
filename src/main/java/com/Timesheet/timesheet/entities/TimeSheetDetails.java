package com.Timesheet.timesheet.entities;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "timesheet_details")
public class TimeSheetDetails {
    @Id
    @Column(name = "logintime")
    private String loginTime;

   @Column(name = "logouttime")
    private String logouttime;

     @Column(name = "total_hours_in_a_week")
    private Long totalHoursInWeek;

     @Column(name = "total_hours_in_a_month")
    private Long totalHoursInMonth;

     @Column(name = "number_of_working_days_in_month")
    private Long numberOfworkingDaysInaWeek;

     @Column(name = "holidays_or_client_management")
    private String holidaysOrClientCalender;

     @Column(name = "leaves_managment")
     private  String leavesManagement;
}
