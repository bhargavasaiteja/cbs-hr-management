package com.codexbox.cbs.hrmanagement.services;

import com.codexbox.cbs.hrmanagement.repositories.EmpRepo;
import com.codexbox.cbs.hrmanagement.entities.BankAccountEntity;
import com.codexbox.cbs.hrmanagement.entities.EmployeeEntity;
import com.codexbox.cbs.hrmanagement.models.EmpDTO;
import com.codexbox.cbs.hrmanagement.repositories.BankAccountRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    public EmpRepo empRepo;
    @Autowired
    public BankAccountRepo bankRepo;
    @Override
    public String saveEmployeeDetails(EmpDTO empDTO) {

        String status = "save successful";
        EmployeeEntity entity = new EmployeeEntity();
        BankAccountEntity bankAccountEntity = mapModelToEntity(empDTO, entity);
        empRepo.save(entity);
        bankRepo.save(bankAccountEntity);


        if (entity == null) {
            status = "unsucessful";
        }
        return status;
    }
    private BankAccountEntity mapModelToEntity(EmpDTO empDTO, EmployeeEntity entity) {
        entity.setEmpId(empDTO.getEmpId());
        entity.setExperience(empDTO.getExperience());
        entity.setPersonalEmailId(empDTO.getPersonalEmailId());
        entity.setMobileNumber(empDTO.getMobileNumber());
        entity.setWorkEmailId(empDTO.getWorkEmailId());
        entity.setCurrentCtc(empDTO.getCurrentCtc());
        entity.setOfferedCtc(empDTO.getOfferedCtc());
        entity.setDoj(empDTO.getDoj());
        entity.setBankUserId(empDTO.getBankUserId());
        entity.setSystemAllocated(empDTO.getSystemAllocated());
        entity.setReportingManager(empDTO.getReportingManager());
        entity.setClientCode(empDTO.getClientCode());
        entity.setClientName(empDTO.getClientName());
        entity.setShiftTimings(empDTO.getShiftTimings());
        entity.setShiftAllowance(empDTO.getShiftAllowance());
        entity.setWorkLocation(empDTO.getWorkLocation());
        entity.setLocationAllowance(empDTO.getLocationAllowance());
        entity.setBankUserId(empDTO.getBankDTO().getBankUserId());
        BankAccountEntity bankAccountEntity = new BankAccountEntity();
        bankAccountEntity.setBankUserId(empDTO.getBankUserId());
        bankAccountEntity.setStatusActive(empDTO.getBankDTO().getStatusActive());
        bankAccountEntity.setNotActive(empDTO.getBankDTO().getNotActive());
        return bankAccountEntity;
    }
}

