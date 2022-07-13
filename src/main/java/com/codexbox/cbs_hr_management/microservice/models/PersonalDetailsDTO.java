package com.codexbox.cbs_hr_management.microservice.models;

import lombok.Data;

@Data
public class PersonalDetailsDTO {


    private int id;

    private String pancard;

    private Long aadharcard;

    private String currentaddress;

    private String permanentaddress;

    private String name;

    private boolean gender;

    private String dob;

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

}
