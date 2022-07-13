package com.codexbox.cbs_onboarding_formalities.models;

import lombok.Data;

import java.util.Date;
@Data
public class EmploymentDTO {
        private Integer empid;
        private Date firstStartDate;
        private Date firstEndDate;
        private Date secondStartDate;
        private Date secondEndDate;
        private Date thirdStartDate;
        private Date thirdEndDate;
        private String reason;


}







