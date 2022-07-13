package com.codexbox.employeeIdcreation.service;

import com.codexbox.employeeIdcreation.entity.CompanyMobileEntity;
import com.codexbox.employeeIdcreation.entity.ProjectEntity;
import com.codexbox.employeeIdcreation.model.CompanyMobileDTO;
import com.codexbox.employeeIdcreation.repository.CompanyMobileRepo;
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
