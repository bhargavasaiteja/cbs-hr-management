package com.codexbox.cbs_onboarding_formalities.controller;

import com.codexbox.cbs_onboarding_formalities.models.EmploymentDTO;
import com.codexbox.cbs_onboarding_formalities.services.EmploymentServiceImpls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CbsEmploymentController {

    @Autowired
    EmploymentServiceImpls employmentServiceImpls;

    @PostMapping("/employmentdetails")
    public ResponseEntity<String> saveEmployeeDetails(@RequestBody EmploymentDTO employmentDTO){
        String emp =employmentServiceImpls.saveEmploymentService(employmentDTO);
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }



}
