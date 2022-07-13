package com.codexbox.cbs_hr_management.microservice.services;

import com.codexbox.cbs_hr_management.microservice.repositories.DepartmentRepo;
import com.codexbox.cbs_hr_management.microservice.entities.DepartmentEntity;
import com.codexbox.cbs_hr_management.microservice.models.DepartmentDTO;
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
