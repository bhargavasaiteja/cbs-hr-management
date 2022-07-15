package com.codexbox.cbs.hrmanagement.controller;


import com.codexbox.cbs.hrmanagement.models.PayslipDTO;
import com.codexbox.cbs.hrmanagement.services.PaySlipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;

@RestController
public class PayrollProcessController {

    @Autowired
    private PaySlipService paySlipService;

    @PostMapping("/payrollProcess")
    public ResponseEntity<InputStreamResource> payrollProcess(@RequestBody PayslipDTO payslipDTO) {

        ByteArrayInputStream bis = paySlipService.payrollService(payslipDTO);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=payslip.pdf");

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(bis));
    }
}

