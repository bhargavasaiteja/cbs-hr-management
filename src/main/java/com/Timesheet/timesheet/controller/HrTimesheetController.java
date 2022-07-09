package com.Timesheet.timesheet.controller;


import com.Timesheet.timesheet.model.TimesheetDTO;
import com.Timesheet.timesheet.service.HrTimeSheetService;
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


    @PostMapping
    public ResponseEntity<String> createTimeSheet(@RequestBody TimesheetDTO timesheetDTO) {
        return new ResponseEntity("Success",  HttpStatus.CREATED);
    }





}


