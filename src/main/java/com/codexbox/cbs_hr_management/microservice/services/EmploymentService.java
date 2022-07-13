package com.codexbox.cbs_hr_management.microservice.services;

import com.codexbox.cbs_hr_management.microservice.models.EmploymentDTO;
import org.springframework.stereotype.Service;

@Service
public interface EmploymentService{
     String saveEmploymentService(EmploymentDTO employmentDTO);


}
