package com.codexbox.employeeIdcreation.service;

import com.codexbox.employeeIdcreation.model.EmpDTO;
import org.springframework.stereotype.Service;

@Service
public interface EmpService {

    public String saveEmployeeDetails(EmpDTO empDTO);
}
