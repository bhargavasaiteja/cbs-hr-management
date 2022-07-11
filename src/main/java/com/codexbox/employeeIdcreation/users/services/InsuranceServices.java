package com.codexbox.employeeIdcreation.users.services;

import com.codexbox.employeeIdcreation.users.entities.InsuranceEntity;
import com.codexbox.employeeIdcreation.users.models.InsuranceDto;
import com.codexbox.employeeIdcreation.users.repository.InsuranceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsuranceServices {
    @Autowired
    InsuranceRepo insuranceRepo;
    public List<InsuranceEntity> insuranceServiceDropDown(){
        return (List<InsuranceEntity>) insuranceRepo.findAll();
    }
    public void  mappingInsuranceDropDown(InsuranceDto insuranceDto, InsuranceEntity insuranceEntity){
        insuranceDto.setId(insuranceEntity.getId());
        insuranceDto.setInsuranceDetails(insuranceEntity.getInsuranceDetails());
    }
}
