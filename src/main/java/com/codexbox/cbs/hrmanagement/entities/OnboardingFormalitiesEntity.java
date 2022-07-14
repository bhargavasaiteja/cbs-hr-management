package com.codexbox.cbs.hrmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="Onboarding_Formalities")
public class OnboardingFormalitiesEntity {
    @Id
    @Column(name = "id" )
    private Integer id;
    @Column(name = "agreed_with_terms" )
    private Boolean agreedWithTerms;
    @Column(name = "  offer_email" )
    private Boolean sent;
    @Column(name = "pan_card" )
    private  String pancard;
    @Column(name = "aadhar_card" )
    private Long aadharcard;
    @Column(name = "current_address" )
    private String currentaddress;
    @Column(name = "permanent_address" )
    private String permanentaddress;
    @Column(name = "name" )
    private String name;
    @Column(name = "gender" )
    private boolean gender;
    @Column(name = "dob" )
    private Date dob;
    @Column(name = "personal_emailid" )
    private String personalemailid;
    @Column(name = "mobile_number" )
    private Long mobilenumber;

    public Boolean getAgreedWithTerms() {
        return agreedWithTerms;
    }

    public void setAgreedWithTerms(Boolean agreedWithTerms) {
        this.agreedWithTerms = agreedWithTerms;
    }

    public Boolean getSent() {
        return sent;
    }

    public void setSent(Boolean sent) {
        this.sent = sent;
    }

    @Column(name = "emergency_contact_number" )
    private Long emergencycontactnumber;
    @Column(name = "bank_account" )
    private Long bankaccount;
    @Column(name = "blood_group" )
    private String bloodgroup;
    @Column(name = "maritial_status" )
    private boolean maritialstatus;
    @Column(name = "father_name" )
    private String fathername;
    @Column(name = "mother_name" )
    private String mothername;
    @Column(name = "spouse_name" )
    private String spousename;
    @Column(name = "children_1" )
    private String children1;
    @Column(name = "children_2" )
    private String children2;
    @Column(name="ssc_Percentage")
    private Float sscPercentage;

    @Column(name="intermediate_Percentage")
    private Float intermediatePercentage;

    @Column(name="intermediate_specialization")
    private String intermediateSpecialization;

    @Column(name="UG_percentage")
    private Float ugPercentage;

    @Column(name="UG_specialization")
    private String ugSpecialization;

    @Column(name="PG_percentage")
    private Float pgPercentage;

    @Column(name="PG_specialization")
    private String pgSpecialization;

    @Column(name="Dr_percentage")
    private Float drPercentage;
    @Column(name="emp_id")
    private Integer empid;

    @Column(name="first_start_date")
    private Date firstStartDate;

    @Column(name="first_end_date")
    private Date firstEndDate;

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Date getFirstStartDate() {
        return firstStartDate;
    }

    public void setFirstStartDate(Date firstStartDate) {
        this.firstStartDate = firstStartDate;
    }

    public Date getFirstEndDate() {
        return firstEndDate;
    }

    public void setFirstEndDate(Date firstEndDate) {
        this.firstEndDate = firstEndDate;
    }

    public Date getSecondStartDate() {
        return secondStartDate;
    }

    public void setSecondStartDate(Date secondStartDate) {
        this.secondStartDate = secondStartDate;
    }

    public Date getSecondEndDate() {
        return secondEndDate;
    }

    public void setSecondEndDate(Date secondEndDate) {
        this.secondEndDate = secondEndDate;
    }

    public Date getThirdStartDate() {
        return thirdStartDate;
    }

    public void setThirdStartDate(Date thirdStartDate) {
        this.thirdStartDate = thirdStartDate;
    }

    public Date getThirdEndDate() {
        return thirdEndDate;
    }

    public void setThirdEndDate(Date thirdEndDate) {
        this.thirdEndDate = thirdEndDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Column(name="second_start_date")
    private Date secondStartDate;

    @Column(name="second_end_date")
    private Date secondEndDate;

    @Column(name="third_start_date")
    private Date thirdStartDate;

    @Column(name="third_end_date")
    private Date thirdEndDate;

    @Column(name="reason_for_relieving_from_current_organization")
    private String reason;


    public void setId(Integer id) {
        this.id = id;
    }

    public void setMobilenumber(Long mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public void setEmergencycontactnumber(Long emergencycontactnumber) {
        this.emergencycontactnumber = emergencycontactnumber;
    }

    public Float getSscPercentage() {
        return sscPercentage;
    }

    public void setSscPercentage(Float sscPercentage) {
        this.sscPercentage = sscPercentage;
    }

    public Float getIntermediatePercentage() {
        return intermediatePercentage;
    }

    public void setIntermediatePercentage(Float intermediatePercentage) {
        this.intermediatePercentage = intermediatePercentage;
    }

    public String getIntermediateSpecialization() {
        return intermediateSpecialization;
    }

    public void setIntermediateSpecialization(String intermediateSpecialization) {
        this.intermediateSpecialization = intermediateSpecialization;
    }

    public Float getUgPercentage() {
        return ugPercentage;
    }

    public void setUgPercentage(Float ugPercentage) {
        this.ugPercentage = ugPercentage;
    }

    public String getUgSpecialization() {
        return ugSpecialization;
    }

    public void setUgSpecialization(String ugSpecialization) {
        this.ugSpecialization = ugSpecialization;
    }

    public Float getPgPercentage() {
        return pgPercentage;
    }

    public void setPgPercentage(Float pgPercentage) {
        this.pgPercentage = pgPercentage;
    }

    public String getPgSpecialization() {
        return pgSpecialization;
    }

    public void setPgSpecialization(String pgSpecialization) {
        this.pgSpecialization = pgSpecialization;
    }

    public Float getDrPercentage() {
        return drPercentage;
    }

    public void setDrPercentage(Float drPercentage) {
        this.drPercentage = drPercentage;
    }

    public String getDrSpecialization() {
        return drSpecialization;
    }

    public void setDrSpecialization(String drSpecialization) {
        this.drSpecialization = drSpecialization;
    }

    @Column(name="Dr_specialization")
    private String drSpecialization;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPancard() {
        return pancard;
    }

    public void setPancard(String pancard) {
        this.pancard = pancard;
    }

    public Long getAadharcard() {
        return aadharcard ;
    }

    public void setAadharcard(Long aadharcard) {
        aadharcard  = aadharcard;
    }

    public String getCurrentaddress() {
        return currentaddress;
    }

    public void setCurrentaddress(String currentaddress) {
        this.currentaddress = currentaddress;
    }

    public String getPermanentaddress() {
        return permanentaddress;
    }

    public void setPermanentaddress(String permanentaddress) {
        this.permanentaddress = permanentaddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPersonalemailid() {
        return personalemailid;
    }

    public void setPersonalemailid(String personalemailid) {
        this.personalemailid = personalemailid;
    }

    public long getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(long mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public long getEmergencycontactnumber() {
        return emergencycontactnumber;
    }

    public void setEmergencycontactnumber(long emergencycontactnumber) {
        this.emergencycontactnumber = emergencycontactnumber;
    }

    public Long getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(Long bankaccount) {
        this.bankaccount = bankaccount;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public boolean isMaritialstatus() {
        return maritialstatus;
    }

    public void setMaritialstatus(boolean maritialstatus) {
        this.maritialstatus = maritialstatus;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getMothername() {
        return mothername;
    }

    public void setMothername(String mothername) {
        this.mothername = mothername;
    }

    public String getSpousename() {
        return spousename;
    }

    public void setSpousename(String spousename) {
        this.spousename = spousename;
    }

    public String getChildren1() {
        return children1;
    }

    public void setChildren1(String children1) {
        this.children1 = children1;
    }

    public String getChildren2() {
        return children2;
    }

    public void setChildren2(String children2) {
        this.children2 = children2;
    }
}
