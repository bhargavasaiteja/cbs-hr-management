package com.codexbox.cbs_onboarding_formalities.entities;


import javax.persistence.*;


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

    public String getHolidaysOrClientCalender() {
        return holidaysOrClientCalender;
    }

    public void setHolidaysOrClientCalender(String holidaysOrClientCalender) {
        this.holidaysOrClientCalender = holidaysOrClientCalender;
    }



    public String getLogInTime() {
        return logInTime;
    }

    public void setLogInTime(String logInTime) {
        this.logInTime = logInTime;
    }

    public String getLogOutTime() {
        return logOutTime;
    }

    public void setLogOutTime(String logOutTime) {
        this.logOutTime = logOutTime;
    }




    public Long getNumberOfWorkingDaysInWeek() {
        return numberOfWorkingDaysInWeek;
    }

    public void setNumberOfWorkingDaysInWeek(Long numberOfWorkingDaysInWeek) {
        this.numberOfWorkingDaysInWeek = numberOfWorkingDaysInWeek;
    }



    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}

