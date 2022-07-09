package com.codexbox.employeeIdcreation.controller;

import com.codexbox.employeeIdcreation.model.EmpDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class EmpController {

    private EmpDTO empDTO;

    @PostMapping("/employeeidcreation")
    public ResponseEntity<EmpDTO> employeeDetails(){
        return ResponseEntity.ok(new EmpDTO());
    }





}
