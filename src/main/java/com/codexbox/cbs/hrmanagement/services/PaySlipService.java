package com.codexbox.cbs.hrmanagement.services;


import com.codexbox.cbs.hrmanagement.entities.PaySlip;
import com.codexbox.cbs.hrmanagement.models.PayslipDTO;
import com.codexbox.cbs.hrmanagement.repositories.PaySlipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaySlipService {

@Autowired
private PaySlipRepo paySlipRepo;

    public PaySlip payrollService(PayslipDTO payslipDTO)
    {
        PaySlip payslip=new PaySlip();
        String status="successfull";
        mapModelToEntity(payslip,payslipDTO);
        return  paySlipRepo.save(payslip);
    }

    void mapModelToEntity(PaySlip payslip, PayslipDTO payslipDTO){
        payslip.setNoOfWorkingDays(payslipDTO.getNoOfWorkingDays());
        payslip.setNoOfDaysPresent(payslipDTO.getNoOfDaysPresent());
        payslip.setCtc(payslipDTO.getCtc());
        payslip.setMonth(payslipDTO.getMonth());
        //payslip.setId(payslipDTO.getId());

    }


}
