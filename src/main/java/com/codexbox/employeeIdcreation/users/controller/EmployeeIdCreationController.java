package com.codexbox.employeeIdcreation.users.controller;

import com.codexbox.employeeIdcreation.users.entities.CompanyMobileEntity;
import com.codexbox.employeeIdcreation.users.models.BandDTO;
import com.codexbox.employeeIdcreation.users.models.InsuranceDTO;
import com.codexbox.employeeIdcreation.users.services.BandService;
import com.codexbox.employeeIdcreation.users.services.CompanyMobileService;
import com.codexbox.employeeIdcreation.users.services.InsuranceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeIdCreationController {
    @Autowired
    private InsuranceServices insuranceServices;

    @Autowired
    private BandService bandService;

    @Autowired
    CompanyMobileService companyMobileService;

    @GetMapping("/insuranceDetails")
    public ResponseEntity<List<InsuranceDTO>> insuranceController() {
        return new ResponseEntity(insuranceServices.insuranceServicedetails(), HttpStatus.OK);
    }
    @GetMapping("/bandName")
    public ResponseEntity<List<BandDTO>> bandController(){
        return new ResponseEntity(bandService.bandServiceDetails(), HttpStatus.OK);
    }
    @GetMapping("/companyMobile")
    public ResponseEntity<List<CompanyMobileEntity>> companyMobileController() {
        return new ResponseEntity(companyMobileService.companyMobileServiceDetails(), HttpStatus.OK);
    }
}
