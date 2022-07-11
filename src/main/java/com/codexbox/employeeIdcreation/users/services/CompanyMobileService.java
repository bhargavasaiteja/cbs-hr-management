package com.codexbox.employeeIdcreation.users.services;

import com.codexbox.employeeIdcreation.users.entities.CompanyMobileEntity;
import com.codexbox.employeeIdcreation.users.models.CompanyMobileDTO;
import com.codexbox.employeeIdcreation.users.repository.CompanyMobileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CompanyMobileService {
    @Autowired
    CompanyMobileRepo companyMobileRepo;
    public List<CompanyMobileDTO> companyMobileDropDownService(){
        List<CompanyMobileEntity> companyMobileEntityList = (List<CompanyMobileEntity>) companyMobileRepo.findAll();
        List<CompanyMobileDTO> companyMobileDTOList = new ArrayList<>();
        companyMobileEntityList.forEach(companyMobileObj ->{
            CompanyMobileDTO companyMobileDTO = new CompanyMobileDTO();
            mappingCompanyMobileDropDown(companyMobileDTO, companyMobileObj);
            companyMobileDTOList.add(companyMobileDTO);
        } );
        return companyMobileDTOList;
    }
    public void  mappingCompanyMobileDropDown(CompanyMobileDTO companyMobileDto, CompanyMobileEntity companyMobileEntity){
        companyMobileDto.setCompanyMobileId(companyMobileEntity.getCompanyMobileId());
        companyMobileDto.setCompanyMobileStatus(companyMobileEntity.getCompanyMobileStatus());
    }
}
