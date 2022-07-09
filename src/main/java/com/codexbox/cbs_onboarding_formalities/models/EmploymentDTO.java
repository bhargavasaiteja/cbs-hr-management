package com.codexbox.cbs_onboarding_formalities.models;

import com.codexbox.cbs_onboarding_formalities.entities.EmploymentDetails;

import java.util.Date;

public class EmploymentDTO {
        private Integer empid;
        private Date firstStartDate;
        private Date firstEndDate;
        private Date secondStartDate;
        private Date secondEndDate;
        private Date thirdStartDate;
        private Date thirdEndDate;
        private String reason;

public EmploymentDTO(EmploymentDetails employmentDetails) {
        if (employmentDetails != null) {
                this.empid = employmentDetails.getEmpid();
                this.firstStartDate = employmentDetails.getFirstStartDate();
                this.firstEndDate = employmentDetails.getFirstEndDate();
                this.secondStartDate = employmentDetails.getSecondStartDate();
                this.secondEndDate = employmentDetails.getSecondEndDate();
                this.thirdStartDate = employmentDetails.getThirdEndDate();
                this.thirdEndDate = employmentDetails.getThirdEndDate();
                this.reason = employmentDetails.getReason();
        }

}
}






