package com.codexbox.cbs_onboarding_formalities.model;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class PersonalDetailsDTO {


    private Long id;

    private  String pancard;

    private String Aadharcard;

    private String currentaddress;

    private String permanentaddress;

    private String name;

    private boolean gender;

    private String dob;

    private String personalemailid;

    private String mobilenumber;

    private String emergencycontactnumber;

    private String bankaccount;

    private String bloodgroup;

    private boolean maritialstatus;

    private String fathername;

    private String mothername;

    private String spousename;

    private String children1;

    private String children2;




}
