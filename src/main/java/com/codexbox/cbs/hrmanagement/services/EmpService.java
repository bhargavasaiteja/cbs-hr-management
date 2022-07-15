package com.codexbox.cbs.hrmanagement.services;

import com.codexbox.cbs.hrmanagement.models.EmpDTO;
import org.springframework.stereotype.Service;

@Service
public interface EmpService {
    public String saveEmployeeDetails(EmpDTO empDTO);
}
