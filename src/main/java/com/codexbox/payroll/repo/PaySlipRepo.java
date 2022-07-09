package com.codexbox.payroll.repo;


import com.codexbox.payroll.entity.PaySlip;
import com.codexbox.payroll.model.PayslipDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PaySlipRepo  extends CrudRepository<PaySlip, Long>{
}






