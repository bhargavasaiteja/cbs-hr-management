package com.codexbox.cbs.hrmanagement.services;

import com.codexbox.cbs.hrmanagement.repositories.DesignationRepository;
import com.codexbox.cbs.hrmanagement.entities.DesignationEntity;
import com.codexbox.cbs.hrmanagement.models.DesignationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class DesignationService {
    @Autowired
    public DesignationRepository designationRepository;

    public List<DesignationDTO> getdesignation() {
        List<DesignationEntity> list = (List<DesignationEntity>)designationRepository.findAll();
        List<DesignationDTO> designationEntityList = new ArrayList<>();
        list.forEach(designationEntity ->{
            DesignationDTO designationDTO = new DesignationDTO();
            mapModelToEntity(designationEntity,designationDTO);
            designationEntityList.add(designationDTO);
        });
        return designationEntityList;
    }
    private void mapModelToEntity(DesignationEntity designationEntity, DesignationDTO designationDTO) {
        designationDTO.setId(designationEntity.getId());
        designationDTO.setDesignatitonname(designationEntity.getDesignatitonName());
    }


}
