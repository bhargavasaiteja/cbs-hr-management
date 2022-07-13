package com.codexbox.cbs_hr_management.microservice.services;


import com.codexbox.cbs_hr_management.microservice.repositories.CompanyMobileRepo;
import com.codexbox.cbs_hr_management.microservice.entities.CompanyMobileEntity;
import com.codexbox.cbs_hr_management.microservice.models.CompanyMobileDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CompanyMobileService {
    @Autowired
    CompanyMobileRepo companyMobileRepo;
    public List<CompanyMobileDTO> companyMobileServiceDetails(){
        List<CompanyMobileEntity> companyMobileEntityList = (List<CompanyMobileEntity>) companyMobileRepo.findAll();
        List<CompanyMobileDTO> companyMobileDTOList = new ArrayList<>();
        companyMobileEntityList.forEach(companyMobileObj ->{
            CompanyMobileDTO companyMobileDTO = new CompanyMobileDTO();
            mappingCompanyMobileEntityAndDTO(companyMobileDTO, companyMobileObj);
            companyMobileDTOList.add(companyMobileDTO);
        } );
        return companyMobileDTOList;
    }
    public void mappingCompanyMobileEntityAndDTO(CompanyMobileDTO companyMobileDto, CompanyMobileEntity companyMobileEntity){
        companyMobileDto.setCompanyMobileId(companyMobileEntity.getCompanyMobileId());
        companyMobileDto.setCompanyMobileStatus(companyMobileEntity.getCompanyMobileStatus());
    }
}
