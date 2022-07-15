package com.codexbox.cbs.hrmanagement.services;


import com.codexbox.cbs.hrmanagement.entities.PaySlipEntity;
import com.codexbox.cbs.hrmanagement.models.PayslipDTO;
import com.codexbox.cbs.hrmanagement.repositories.PaySlipRepo;
import com.codexbox.cbs.hrmanagement.util.PdfGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;

@Service
public class PaySlipService {

    @Autowired
    private PaySlipRepo paySlipRepo;

    public ByteArrayInputStream payrollService(PayslipDTO payslipDTO) {
        PaySlipEntity payslip=new PaySlipEntity();
        mapModelToEntity(payslip,payslipDTO);
        PaySlipEntity paySlip =  paySlipRepo.save(payslip);
        ByteArrayInputStream bis = PdfGenerator.payslipPDFReport(paySlip);

        //save or upload this bis/pdf into local drive or shared drive
        uploadGeneratedPdf(bis);
        return bis;
    }

    private void uploadGeneratedPdf(ByteArrayInputStream bis) {

    }

    private void mapModelToEntity(PaySlipEntity payslip, PayslipDTO payslipDTO) {
        payslip.setNoOfWorkingDays(payslipDTO.getNoOfWorkingDays());
        payslip.setNoOfDaysPresent(payslipDTO.getNoOfDaysPresent());
        payslip.setCtc(payslipDTO.getCtc());
        payslip.setMonth(payslipDTO.getMonth());
        //payslip.setId(payslipDTO.getId());
    }
}
