package com.Timesheet.timesheet.entities;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "hr_timesheet_details")
@Entity
public class TimeSheetDetails {

    @Id
    @Column(name = "emp_Id")
    private int empId;
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



    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public String getLogouttime() {
        return logouttime;
    }

    public void setLogouttime(String logouttime) {
        this.logouttime = logouttime;
    }

    public Long getTotalHoursInWeek() {
        return totalHoursInWeek;
    }

    public void setTotalHoursInWeek(Long totalHoursInWeek) {
        this.totalHoursInWeek = totalHoursInWeek;
    }

    public Long getTotalHoursInMonth() {
        return totalHoursInMonth;
    }

    public void setTotalHoursInMonth(Long totalHoursInMonth) {
        this.totalHoursInMonth = totalHoursInMonth;
    }

    public Long getNumberOfworkingDaysInaWeek() {
        return numberOfworkingDaysInaWeek;
    }

    public void setNumberOfworkingDaysInaWeek(Long numberOfworkingDaysInaWeek) {
        this.numberOfworkingDaysInaWeek = numberOfworkingDaysInaWeek;
    }

    public String getHolidaysOrClientCalender() {
        return holidaysOrClientCalender;
    }

    public void setHolidaysOrClientCalender(String holidaysOrClientCalender) {
        this.holidaysOrClientCalender = holidaysOrClientCalender;
    }

    public String getLeavesManagement() {
        return leavesManagement;
    }

    public void setLeavesManagement(String leavesManagement) {
        this.leavesManagement = leavesManagement;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}

