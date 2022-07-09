package com.codexbox.payroll.service;


import com.codexbox.payroll.entity.PaySlip;
import com.codexbox.payroll.model.PayslipDTO;
import com.codexbox.payroll.repo.PaySlipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaySlipService {

@Autowired
private PaySlipRepo paySlipRepo;
PaySlip payslip=new PaySlip();

    public String payrollService(PayslipDTO payslipDTO)
    {
        String status="successfull";
        mapmodeltoentity(payslipDTO,payslip);
        paySlipRepo.save(payslip);
        return status;
    }

    void mapmodeltoentity(PayslipDTO payslipDTO, PaySlip payslip){
        payslip.setNoofworkingdays(payslipDTO.getNoofworkingdays());
        payslip.setNoofdays(payslipDTO.getNoofdays());
        payslip.setCalctc(payslipDTO.getCalctc());
        payslip.setId(1);
    }


}
