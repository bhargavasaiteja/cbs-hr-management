package com.codexbox.cbs.hrmanagement.services;


import com.codexbox.cbs.hrmanagement.repositories.CompanyMobileRepo;
import com.codexbox.cbs.hrmanagement.entities.CompanyMobileEntity;
import com.codexbox.cbs.hrmanagement.models.CompanyMobileDTO;
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
