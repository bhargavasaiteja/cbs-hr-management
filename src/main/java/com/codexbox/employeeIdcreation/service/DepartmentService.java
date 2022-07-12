package com.codexbox.employeeIdcreation.service;
import com.codexbox.employeeIdcreation.entity.DepartmentEntity;
import com.codexbox.employeeIdcreation.model.DepartmentDTO;
import com.codexbox.employeeIdcreation.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    public DepartmentRepo repo;
@Transactional
    public List<DepartmentDTO> department() {
    List<DepartmentEntity> entityList = (List<DepartmentEntity>) repo.findAll();
    List<DepartmentDTO> departDTOList = new ArrayList();
        entityList.forEach(entity->{
            DepartmentDTO departmentDTO = new DepartmentDTO();
            MapModelToDepartmentEntity(entity,departmentDTO);
            departDTOList.add(departmentDTO);
        });
        return departDTOList;
    }
    private void MapModelToDepartmentEntity(DepartmentEntity entity, DepartmentDTO departmentDTO) {
        departmentDTO.setDepartmentId(entity.getDepartmentId());
        departmentDTO.setDepartmentName(entity.getDepartmentName());
    }
}
