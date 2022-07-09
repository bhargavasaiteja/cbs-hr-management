package com.codexbox.payroll.controller;


import com.codexbox.payroll.model.PayslipDTO;
import com.codexbox.payroll.service.PaySlipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayrollProcess {

    @Autowired
    private PaySlipService paySlipService;

    @PostMapping("/payrollProcess")
    public ResponseEntity<String> payrollProcess(@RequestBody PayslipDTO payslipDTO) {

String status =paySlipService.payrollService(payslipDTO.getNoofdays(),payslipDTO.getNoofworkingdays(),payslipDTO.getCalculatedctc());
        return new ResponseEntity<>(status, HttpStatus.OK);
    }


}
