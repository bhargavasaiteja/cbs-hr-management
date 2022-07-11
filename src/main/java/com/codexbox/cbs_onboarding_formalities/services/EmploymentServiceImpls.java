package com.codexbox.cbs_onboarding_formalities.services;

import com.codexbox.cbs_onboarding_formalities.entities.EmploymentDetails;
import com.codexbox.cbs_onboarding_formalities.models.EmploymentDTO;
import com.codexbox.cbs_onboarding_formalities.repositories.EmploymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmploymentServiceImpls implements EmploymentService {
    @Autowired
   private EmploymentRepo employmentRepo;


    @Override
    public String saveEmploymentService(EmploymentDTO employmentDTO) {
        String status  = "data is not saved";
        EmploymentDetails employmentDetails = new EmploymentDetails();
        mappingModelToEntity(employmentDTO,employmentDetails);
        employmentRepo.save(employmentDetails);
        if(employmentDetails != null ){
             status = "data is saved ";
        }

        return status;
    }

    public void mappingModelToEntity(EmploymentDTO employmentDTO, EmploymentDetails employmentDetails){
        employmentDetails.setEmpid(employmentDTO.getEmpid());
        employmentDetails.setFirstStartDate(employmentDTO.getFirstStartDate());
        employmentDetails.setFirstEndDate(employmentDTO.getFirstEndDate());
        employmentDetails.setSecondStartDate(employmentDTO.getSecondStartDate());
        employmentDetails.setSecondEndDate(employmentDTO.getSecondEndDate());
        employmentDetails.setThirdStartDate(employmentDTO.getThirdStartDate());
        employmentDetails.setThirdEndDate(employmentDTO.getThirdEndDate());
        employmentDetails.setReason(employmentDTO.getReason());

    }

}
