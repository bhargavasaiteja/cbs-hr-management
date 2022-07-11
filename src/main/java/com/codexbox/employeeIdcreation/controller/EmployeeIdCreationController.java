package com.codexbox.employeeIdcreation.controller;
import com.codexbox.employeeIdcreation.model.DepartmentDTO;
import com.codexbox.employeeIdcreation.model.ProjectBillingStatusDTO;
import com.codexbox.employeeIdcreation.service.DepartmentService;
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
    public ProjectStatusBillingService projectStatusBillingService;
    @Autowired
    public DepartmentService departmentService;
    @GetMapping("/billingStatus")
    public ResponseEntity< List<ProjectBillingStatusDTO>> getProjectData(){
        return new ResponseEntity<>(projectStatusBillingService.getProjectDetails(), HttpStatus.OK);
    }
    @GetMapping("/departmentDetails")
    public ResponseEntity<List<DepartmentDTO>> getDepartmentData(){
        return new ResponseEntity<>( departmentService.department(), HttpStatus.OK);
    }
}
