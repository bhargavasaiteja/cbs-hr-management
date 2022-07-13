package com.codexbox.cbs_onboarding_formalities.services;

import com.codexbox.cbs_onboarding_formalities.entities.SkillsEntity;
import com.codexbox.cbs_onboarding_formalities.models.SkillsDTO;
import com.codexbox.cbs_onboarding_formalities.repositories.SkillsRepository;
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
