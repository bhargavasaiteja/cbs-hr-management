package com.codexbox.cbs_onboarding_formalities.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personal_details")
public class PersonalDetailsEntity {
    @Id
    @Column(name = "id" )
    private Integer id;
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
    private String dob;
    @Column(name = "personal_emailid" )
    private String personalemailid;
    @Column(name = "mobile_number" )
    private Long mobilenumber;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
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
