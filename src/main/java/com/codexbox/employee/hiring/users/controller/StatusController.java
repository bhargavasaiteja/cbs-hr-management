package com.codexbox.employee.hiring.users.controller;
import com.codexbox.employee.hiring.users.entities.StatusEntity;
import com.codexbox.employee.hiring.users.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StatusController {
    @Autowired
    StatusService statusService;

    @GetMapping("/status")
    public ResponseEntity<List<StatusEntity>> getSelectStatus() {
        return new ResponseEntity<>(statusService.getStatusDetails(), HttpStatus.OK);
    }
}


