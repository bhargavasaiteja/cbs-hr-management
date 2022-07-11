package com.codexbox.employeeIdcreation.users.services;

import com.codexbox.employeeIdcreation.users.entities.CompanyMobileEntity;
import com.codexbox.employeeIdcreation.users.models.CompanyMobileDto;
import com.codexbox.employeeIdcreation.users.repository.CompanyMobileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CompanyMobileService {
    @Autowired
    CompanyMobileRepo companyMobileRepo;
    public List<CompanyMobileEntity> companyMobileDropDownService(){
        return (List<CompanyMobileEntity>) companyMobileRepo.findAll();
    }
    public void  mappingCompanyMobileDropDown(CompanyMobileDto companyMobileDto, CompanyMobileEntity companyMobileEntity){
        companyMobileDto.setId(companyMobileEntity.getId());
        companyMobileDto.setCompanyMobileStatus(companyMobileEntity.getCompanyMobileStatus());
    }
}
