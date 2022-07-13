package com.codexbox.cbs.hrmanagement.services;

import com.codexbox.cbs.hrmanagement.repositories.SkillsRepository;
import com.codexbox.cbs.hrmanagement.entities.SkillsEntity;
import com.codexbox.cbs.hrmanagement.models.SkillsDTO;
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
        List<SkillsEntity> skillsEntityList = (List<SkillsEntity>) skillsRepository.findAll();
        List<SkillsDTO> skillsDTOList = new ArrayList<>();
        skillsEntityList.forEach(entity -> {
            SkillsDTO skillsDTO = new SkillsDTO();
            mapModelToSkillsEntity(entity,skillsDTO);
            skillsDTOList.add(skillsDTO);
        });
        return skillsDTOList;
    }

    private void mapModelToSkillsEntity(SkillsEntity entity, SkillsDTO skillsDTO) {
        skillsDTO.setId(entity.getId());
        skillsDTO.setSkillsName(entity.getSkillsName());
    }


}
