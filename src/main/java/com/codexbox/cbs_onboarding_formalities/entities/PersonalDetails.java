package com.codexbox.cbs_onboarding_formalities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personal_details")
public class PersonalDetails {
    @Id
    @Column(name = "id" )
    private Long id;
    @Column(name = "pan_card" )
    private  String pancard;
    @Column(name = "aadhar_card" )
    private String Aadharcard;
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
    @Column(name = "mobile_numbe" )
    private String mobilenumber;
    @Column(name = "emergency_contact_number" )
    private String emergencycontactnumber;
    @Column(name = "bank_account" )
    private String bankaccount;
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



}
