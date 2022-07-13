package com.codexbox.cbs_onboarding_formalities.controller;


import com.codexbox.cbs_onboarding_formalities.models.TimesheetDTO;
import com.codexbox.cbs_onboarding_formalities.services.HrTimeSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HrTimesheetController {
    @Autowired
    private HrTimeSheetService hrTimeSheetService;
    public TimesheetDTO service;


    @PostMapping("/timesheet")
    public ResponseEntity<String> TimesheetDTO(@RequestBody TimesheetDTO timesheetDTO) {
        String status= hrTimeSheetService.hrTimeSheetService(timesheetDTO);
        return new ResponseEntity(status,  HttpStatus.CREATED);
    }





}


