package com.codexbox.cbs_onboarding_formalities.services;

import com.codexbox.cbs_onboarding_formalities.models.EducationDTO;
import org.springframework.stereotype.Service;

@Service
public interface EducationService {
    String educationDetails(EducationDTO educationDTO);
}
