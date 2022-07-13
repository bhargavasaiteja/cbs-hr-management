package com.codexbox.cbs.hrmanagement.controller;

import com.codexbox.cbs.hrmanagement.services.ProfileService;
import com.codexbox.cbs.hrmanagement.models.EmployeeHiringModel;
import com.codexbox.cbs.hrmanagement.models.ProfileModel;
import com.codexbox.cbs.hrmanagement.models.StatusModel;
import com.codexbox.cbs.hrmanagement.services.EmployeeHiringServices;
import com.codexbox.cbs.hrmanagement.services.StatusService;
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

    @GetMapping("/employeeHiringProfiles")
    public ResponseEntity<List<ProfileModel>> getProfilesStatus() {
        return new ResponseEntity<>(profileService.getProfileDetails(),HttpStatus.OK);
    }
    @GetMapping("/employeeHiringStatus")
    public ResponseEntity <List<StatusModel>> getSelectStatus() {
        return new ResponseEntity<>(statusService.getStatusDetails(), HttpStatus.OK);
    }
    @PostMapping("/employeeHiringSubmit")
    public ResponseEntity<EmployeeHiringModel> submitHiringDetails(@RequestBody EmployeeHiringModel employeeHiringModel) {
        String saveDetails = employeeHiringServices.saveSubmitDetails(employeeHiringModel);
        return new ResponseEntity(saveDetails, HttpStatus.OK);
    }
}
