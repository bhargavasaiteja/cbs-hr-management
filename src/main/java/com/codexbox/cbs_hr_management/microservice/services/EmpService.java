package com.codexbox.cbs_hr_management.microservice.services;

import com.codexbox.cbs_hr_management.microservice.models.EmpDTO;
import org.springframework.stereotype.Service;

@Service
public interface EmpService {

    public String saveEmployeeDetails(EmpDTO empDTO);
}
