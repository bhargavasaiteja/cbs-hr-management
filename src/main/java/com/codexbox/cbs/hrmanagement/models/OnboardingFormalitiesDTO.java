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

    private String personalEmailId;

    private long mobileNumber;

    private long emergencyContactNumber;

    private Long bankAccount;

    private String bloodGroup;

    private boolean maritalStatus;

    private String fatherName;

    private String motherName;

    private String spouseName;

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

    private Integer empId;

    private Date firstStartDate;

    private Date firstEndDate;

    private Date secondStartDate;

    private Date secondEndDate;

    private Date thirdStartDate;

    private Date thirdEndDate;

    private String reason;

}
