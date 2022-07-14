package com.codexbox.cbs.hrmanagement.models;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Data
@Configuration
public class OnboardingFormalitiesDTO {


    private int id;
    private Boolean agreedwithterms;
    private Boolean sent;

    private String pancard;

    private Long aadharcard;

    private String currentaddress;

    private String permanentaddress;

    private String name;

    private boolean gender;

    private Date dob;

    private String personalemailid;

    private long mobilenumber;

    private long emergencycontactnumber;

    private Long bankaccount;

    private String bloodgroup;

    private boolean maritialstatus;

    private String fathername;

    private String mothername;

    private String spousename;

    private String children1;

    private String children2;
    private Float sscPercentage;
    private Float IntermediatePercentage;
    private String IntermediateSpecialization;
    private Float ugPercentage;
    private String ugSpecialization;
    private Float pgPercentage;
    private String pgSpecialization;
    private Float drPercentage;
    private String drSpecialization;
    private Integer empid;
    private Date firstStartDate;
    private Date firstEndDate;
    private Date secondStartDate;
    private Date secondEndDate;
    private Date thirdStartDate;
    private Date thirdEndDate;
    private String reason;

}
