package com.codexbox.employeeIdcreation.service;

import com.codexbox.employeeIdcreation.entity.SkillsEntity;
import com.codexbox.employeeIdcreation.model.SkillsDTO;
import com.codexbox.employeeIdcreation.repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service

public class SkillsService {
    @Autowired
    public SkillsRepository skillsRepository;

    @Transactional
    public List<SkillsDTO> getskills() {

        List<SkillsDTO> skillsDTOList = new ArrayList<>();
        List<SkillsEntity> skillsEntityList = (List<SkillsEntity>) skillsRepository.findAll();
        skillsEntityList.forEach(entity -> {
            SkillsDTO skillsDTO = new SkillsDTO();
            mapModelToSkillsEntity(entity,skillsDTO);
            skillsDTOList.add(skillsDTO);
        });
        return skillsDTOList;
    }

    private void mapModelToSkillsEntity(SkillsEntity entity, SkillsDTO skillsDTO) {
        skillsDTO.setId(entity.getId());
        skillsDTO.setSkillsName(entity.getSkillsname());
    }


}
