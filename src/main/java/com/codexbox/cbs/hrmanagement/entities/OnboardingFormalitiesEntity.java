package com.codexbox.cbs.hrmanagement.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Data
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

    @Column(name = "emergency_contact_number" )
    private Long emergencycontactnumber;

    @Column(name = "bank_account" )
    private Long bankaccount;

    @Column(name = "blood_group" )
    private String bloodGroup;

    @Column(name = "maritial_status" )
    private boolean maritialStatus;

    @Column(name = "father_name" )
    private String fatherName;

    @Column(name = "mother_name" )
    private String motherName;

    @Column(name = "spouse_name" )
    private String spouseName;

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

    @Column(name="Dr_specialization")
    private String drSpecialization;

}
