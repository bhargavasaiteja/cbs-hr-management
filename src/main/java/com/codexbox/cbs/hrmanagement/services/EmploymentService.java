package com.codexbox.cbs.hrmanagement.services;

import com.codexbox.cbs.hrmanagement.models.EmploymentDTO;
import org.springframework.stereotype.Service;

@Service
public interface EmploymentService{
     String saveEmploymentService(EmploymentDTO employmentDTO);


}
