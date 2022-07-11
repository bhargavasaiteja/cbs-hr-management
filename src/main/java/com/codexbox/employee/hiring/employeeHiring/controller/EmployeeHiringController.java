package com.codexbox.employee.hiring.employeeHiring.controller;

import com.codexbox.employee.hiring.employeeHiring.entities.ProfileEntity;
import com.codexbox.employee.hiring.employeeHiring.entities.StatusEntity;
import com.codexbox.employee.hiring.employeeHiring.models.EmployeeHiringModel;
import com.codexbox.employee.hiring.employeeHiring.services.EmployeeHiringServices;
import com.codexbox.employee.hiring.employeeHiring.services.ProfileService;
import com.codexbox.employee.hiring.employeeHiring.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeHiringController {
    @Autowired
    private EmployeeHiringServices employeeHiringServices;
    @Autowired
    private ProfileService profileService;
    @Autowired
    private StatusService statusService;

    @GetMapping("/EmployeeHiringProfile")
    public ResponseEntity<List<ProfileEntity>> getProfilesStatus() {
        return new ResponseEntity<>(profileService.getProfileDetails(),HttpStatus.OK);
    }
    @GetMapping("/EmployeeHiringStatus")
    public ResponseEntity<List<StatusEntity>> getStatus() {
        return new ResponseEntity<>(statusService.getStatusDetails(), HttpStatus.OK);
    }
    @PostMapping("/EmployeeHiringSubmit")
    public ResponseEntity<EmployeeHiringModel> submitHiringDetails(@RequestBody EmployeeHiringModel employeeHiringModel) {
      String saveDetails = employeeHiringServices.saveSubmitDetails(employeeHiringModel);
        return new ResponseEntity(saveDetails, HttpStatus.OK);
    }
}
