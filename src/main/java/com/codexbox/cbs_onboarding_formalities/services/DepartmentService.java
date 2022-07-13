package com.codexbox.cbs_onboarding_formalities.services;

import com.codexbox.cbs_onboarding_formalities.entities.DepartmentEntity;
import com.codexbox.cbs_onboarding_formalities.models.DepartmentDTO;
import com.codexbox.cbs_onboarding_formalities.repositories.DepartmentRepo;
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
