package com.codexbox.employeeIdcreation.controller;
import com.codexbox.employeeIdcreation.model.DepartmentDTO;
import com.codexbox.employeeIdcreation.model.ProjectBillingStatusDTO;
import com.codexbox.employeeIdcreation.models.GeoDTO;
import com.codexbox.employeeIdcreation.models.ProjectDTO;
import com.codexbox.employeeIdcreation.service.CountryService;
import com.codexbox.employeeIdcreation.service.DepartmentService;
import com.codexbox.employeeIdcreation.service.ProjectService;
import com.codexbox.employeeIdcreation.service.ProjectStatusBillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class EmployeeIdCreationController {
    @Autowired
    public CountryService countryService;
    @Autowired
    public ProjectService projectService;
    @Autowired
    public ProjectStatusBillingService projectStatusBillingService;
    @Autowired
    public DepartmentService departmentService;
    @GetMapping("/getLocations")
    public ResponseEntity<List<ProjectDTO>> fetchProjectStatusDetails(){
        return new ResponseEntity<>(projectService.getProjectDetails(),HttpStatus.OK);
    }
    @GetMapping("/getCountries")
    public ResponseEntity<List<GeoDTO>> fetchGeoStatusDetails(){
        return new ResponseEntity<>(countryService.getGeoDetails(),HttpStatus.OK);
    }

    @GetMapping("/billingStatus")
    public ResponseEntity< List<ProjectBillingStatusDTO>> getProjectData(){
        return new ResponseEntity<>(projectStatusBillingService.getProjectDetails(), HttpStatus.OK);
    }
    @GetMapping("/departmentDetails")
    public ResponseEntity<List<DepartmentDTO>> getDepartmentData(){
        return new ResponseEntity<>( departmentService.department(), HttpStatus.OK);
    }
}
