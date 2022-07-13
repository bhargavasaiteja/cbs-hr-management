package com.codexbox.cbs_onboarding_formalities.services;

import com.codexbox.cbs_onboarding_formalities.models.EmpDTO;
import org.springframework.stereotype.Service;

@Service
public interface EmpService {

    public String saveEmployeeDetails(EmpDTO empDTO);
}
