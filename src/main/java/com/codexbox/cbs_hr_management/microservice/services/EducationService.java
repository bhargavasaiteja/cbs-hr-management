package com.codexbox.cbs_hr_management.microservice.services;

import com.codexbox.cbs_hr_management.microservice.models.EducationDTO;
import org.springframework.stereotype.Service;

@Service
public interface EducationService {
    String educationDetails(EducationDTO educationDTO);
}
