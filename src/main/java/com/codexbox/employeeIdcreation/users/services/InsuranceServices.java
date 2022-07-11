package com.codexbox.employeeIdcreation.users.services;

import com.codexbox.employeeIdcreation.users.entities.InsuranceEntity;
import com.codexbox.employeeIdcreation.users.models.InsuranceDTO;
import com.codexbox.employeeIdcreation.users.repository.InsuranceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InsuranceServices {
    @Autowired
    InsuranceRepo insuranceRepo;
    public List<InsuranceDTO> insuranceServicedetails(){
     List<InsuranceEntity> insuranceEntityList = (List<InsuranceEntity>) insuranceRepo.findAll();
     List<InsuranceDTO> insuranceDTOList = new ArrayList<>();
     insuranceEntityList.forEach(insuranceObj -> {
         InsuranceDTO insuranceDTO = new InsuranceDTO();
         mappingInsuranceEntityAndDTO(insuranceDTO, insuranceObj);
         insuranceDTOList.add(insuranceDTO);
     });
     return insuranceDTOList;
    }

    public void mappingInsuranceEntityAndDTO(InsuranceDTO insuranceDto, InsuranceEntity insuranceEntity){
        insuranceDto.setInsuranceId(insuranceEntity.getInsuranceId());
        insuranceDto.setInsuranceDetails(insuranceEntity.getInsuranceDetails());
    }
}
