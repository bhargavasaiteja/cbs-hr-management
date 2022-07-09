package com.codexbox.employeeIdcreation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name="employee_details")
public class EmpEntity {
    @Id
    @Column(name="emp_id")
    private Integer  empId ;
    private Integer  experience ;
    @Column(name="personalEmailId")
    private String personalEmailId ;
    @Column(name="work_email_id")
    private String workEmailId ;
    @Column(name="current_ctc")
    private String currentCtc ;
    @Column(name="mobile_number")
    private Long  mobileNumber ;
    @Column(name="offered_ctc")
    private String offeredCtc ;
    private Date doj ;
    @Column(name=" system_allocated")
    private String systemAllocated ;
    @Column(name="reporting_manager")
    private String reportingManager ;
    @Column( name="bank_user_id")
    private Integer bankUserId ;
    @Column(name="client_name")
    private String clientName ;
    @Column(name="client_code")
    private Integer clientCode ;
    @Column(name="shift_timings")
    private String shiftTimings ;
    @Column(name="shift-allowance")
    private Integer shiftAllowance ;
    @Column(name="work_location")
    private String workLocation;
    @Column(name="location_allowance")
    private String locationAllowance ;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getPersonalEmailId() {
        return personalEmailId;
    }

    public void setPersonalEmailId(String personalEmailId) {
        this.personalEmailId = personalEmailId;
    }

    public String getWorkEmailId() {
        return workEmailId;
    }

    public void setWorkEmailId(String workEmailId) {
        this.workEmailId = workEmailId;
    }

    public String getCurrentCtc() {
        return currentCtc;
    }

    public void setCurrentCtc(String currentCtc) {
        this.currentCtc = currentCtc;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getOfferedCtc() {
        return offeredCtc;
    }

    public void setOfferedCtc(String offeredCtc) {
        this.offeredCtc = offeredCtc;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public String getSystemAllocated() {
        return systemAllocated;
    }

    public void setSystemAllocated(String systemAllocated) {
        this.systemAllocated = systemAllocated;
    }

    public String getReportingManager() {
        return reportingManager;
    }

    public void setReportingManager(String reportingManager) {
        this.reportingManager = reportingManager;
    }

    public Integer getBankUserId() {
        return bankUserId;
    }

    public void setBankUserId(Integer bankUserId) {
        this.bankUserId = bankUserId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Integer getClientCode() {
        return clientCode;
    }

    public void setClientCode(Integer clientCode) {
        this.clientCode = clientCode;
    }

    public String getShiftTimings() {
        return shiftTimings;
    }

    public void setShiftTimings(String shiftTimings) {
        this.shiftTimings = shiftTimings;
    }

    public Integer getShiftAllowance() {
        return shiftAllowance;
    }

    public void setShiftAllowance(Integer shiftAllowance) {
        this.shiftAllowance = shiftAllowance;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public String getLocationAllowance() {
        return locationAllowance;
    }

    public void setLocationAllowance(String locationAllowance) {
        this.locationAllowance = locationAllowance;
    }
}
