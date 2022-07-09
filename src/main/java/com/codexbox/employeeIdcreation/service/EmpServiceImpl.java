package com.codexbox.employeeIdcreation.service;

import com.codexbox.employeeIdcreation.entity.EmpEntity;
import com.codexbox.employeeIdcreation.model.EmpDTO;
import com.codexbox.employeeIdcreation.repositry.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpServiceImpl implements  EmpService {


    @Autowired
    private EmpRepo repo;

    @Override
    @Transactional
    public void submitEmployeeDetails(EmpDTO empDTO) {
        EmpEntity entity = new EmpEntity();
        mappingtheData(entity, empDTO);
        EmpEntity entity1= repo.save(entity);

}

    private void mappingtheData(EmpEntity entity, EmpDTO empDTO) {
        entity.setEmpId(empDTO.getEmpId());
        entity.setBankUserId(empDTO.getBankUserId());
        entity.setClientCode(empDTO.getClientCode());
        entity.setPersonalEmailId(empDTO.getPersonalEmailId());
        entity.setDoj(empDTO.getDoj());

    }
    }
