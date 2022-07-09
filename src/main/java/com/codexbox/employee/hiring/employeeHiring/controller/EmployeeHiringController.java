package com.codexbox.employee.hiring.employeeHiring.controller;

import com.codexbox.employee.hiring.employeeHiring.models.EmployeeHiringModel;
import com.codexbox.employee.hiring.employeeHiring.services.EmployeeHiringServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeHiringController {
    @Autowired
    private EmployeeHiringServices employeeHiringServices;
    public EmployeeHiringController(EmployeeHiringModel employeeHiringModel) {
    }
    @PostMapping("/submit")
    public ResponseEntity<EmployeeHiringModel> createRole(@RequestBody EmployeeHiringModel employeeHiringModel) {
      String saveDetails = employeeHiringServices.saveSubmitDetails(employeeHiringModel);
        return new ResponseEntity(saveDetails, HttpStatus.OK);
    }
}
