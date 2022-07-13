package com.codexbox.cbs_onboarding_formalities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "employee_details")
public class EmployeeEntity {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

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


    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
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

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCurrentCtc() {
        return currentCtc;
    }

    public void setCurrentCtc(String currentCtc) {
        this.currentCtc = currentCtc;
    }

    public String getOfferedCtc() {
        return offeredCtc;
    }

    public void setOfferedCtc(String offeredCtc) {
        this.offeredCtc = offeredCtc;
    }

    public Date getDoj() {
        return Doj;
    }

    public void setDoj(Date doj) {
        Doj = doj;
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

    public String getShiftAllowance() {
        return shiftAllowance;
    }

    public void setShiftAllowance(String shiftAllowance) {
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

    public Long getBankUserId() {
        return bankUserId;
    }

    public void setBankUserId(Long bankUserId) {
        this.bankUserId = bankUserId;
    }
}
