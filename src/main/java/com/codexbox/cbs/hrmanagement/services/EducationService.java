package com.codexbox.cbs.hrmanagement.services;

import com.codexbox.cbs.hrmanagement.models.EducationDTO;
import org.springframework.stereotype.Service;

@Service
public interface EducationService {
    String educationDetails(EducationDTO educationDTO);
}
