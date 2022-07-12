package com.codexbox.employeeIdcreation.controller;
import com.codexbox.employeeIdcreation.entity.CompanyMobileEntity;
import com.codexbox.employeeIdcreation.entity.DesignationEntity;
import com.codexbox.employeeIdcreation.entity.SkillsEntity;
import com.codexbox.employeeIdcreation.model.*;
import com.codexbox.employeeIdcreation.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
    @GetMapping("/billingStatus")
    public ResponseEntity< List<BillingStatusDTO>> getProjectData(@RequestBody BillingStatusDTO billingStatusDTO){
        return new ResponseEntity<>(billingService.getProjectDetails(), HttpStatus.OK);
    }
    @GetMapping("/departmentDetails")
    public ResponseEntity<List<DepartmentDTO>> getDepartmentData(@RequestBody DepartmentDTO departmentDTO) {
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
    @GetMapping("/getCountries")
    ResponseEntity<List<GeoDTO>> fetchGeoStatusDetails(){
        return new ResponseEntity<>(countryService.getGeoDetails(),HttpStatus.OK);
    }
    @GetMapping("/getLocations")
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




