package com.codexbox.cbs_onboarding_formalities.services;

import com.codexbox.cbs_onboarding_formalities.models.EmploymentDTO;
import org.springframework.stereotype.Service;

@Service
public interface EmploymentService{
     String saveEmploymentService(EmploymentDTO employmentDTO);


}
