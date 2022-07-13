package com.codexbox.cbs_hr_management.microservice.services;

import com.codexbox.cbs_hr_management.microservice.repositories.EmploymentRepo;
import com.codexbox.cbs_hr_management.microservice.entities.EmploymentDetails;
import com.codexbox.cbs_hr_management.microservice.models.EmploymentDTO;
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
