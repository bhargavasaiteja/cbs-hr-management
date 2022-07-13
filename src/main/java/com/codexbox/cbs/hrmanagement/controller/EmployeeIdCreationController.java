package com.codexbox.cbs.hrmanagement.controller;

import com.codexbox.cbs.hrmanagement.entities.CompanyMobileEntity;
import com.codexbox.cbs.hrmanagement.entities.DesignationEntity;
import com.codexbox.cbs.hrmanagement.entities.SkillsEntity;
import com.codexbox.cbs.hrmanagement.models.*;
import com.codexbox.cbs.hrmanagement.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class EmployeeIdCreationController {
    @Autowired
    public SkillsService skillsService;
    @Autowired
    public DesignationService designationService;
    @Autowired
    public BillingService billingService;
    @Autowired
    public DepartmentService departmentService;
    @Autowired
    private InsuranceServices insuranceServices;
    @Autowired
    private BandService bandService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private ProjectService projectService;

    @Autowired
    CompanyMobileService companyMobileService;
    @Autowired
    private EmpService empService;




    @PostMapping("/employee")
    public ResponseEntity<String> saveEmployeeDetails(@RequestBody EmpDTO empDTO) {
        empDTO.setBankUserId(empDTO.getBankDTO());
        return  new ResponseEntity<>(empService.saveEmployeeDetails(empDTO), HttpStatus.OK);
    }
    @GetMapping("/billingStatus")
    public ResponseEntity< List<BillingStatusDTO>> getProjectData(){
        return new ResponseEntity<>(billingService.getProjectDetails(), HttpStatus.OK);
    }
    @GetMapping("/departmentDetails")
    public ResponseEntity<List<DepartmentDTO>> getDepartmentData() {
        return new ResponseEntity<>(departmentService.department(), HttpStatus.OK);
    }
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
    @GetMapping("/getGeo")
    ResponseEntity<List<GeoDTO>> fetchGeoStatusDetails(){
        return new ResponseEntity<>(countryService.getGeoDetails(),HttpStatus.OK);
    }
    @GetMapping("/getproject")
    ResponseEntity<List<ProjectDTO>> fetchProjectStatusDetails(){
        return new ResponseEntity<>(projectService.getProjectDetails(),HttpStatus.OK);
    }
    @GetMapping("/skills")
    public ResponseEntity<List<SkillsEntity>> findSkillsById() {
        return new ResponseEntity(  skillsService.getskills(), HttpStatus.OK);
    }

    @GetMapping("/designation")
    public ResponseEntity<List<DesignationEntity>> findDesignationbyId(){
        return new ResponseEntity(designationService.getdesignation(),HttpStatus.OK);
    }
}




