package com.codexbox.cbs_onboarding_formalities.repositories;

import com.codexbox.cbs_onboarding_formalities.entities.SkillsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends CrudRepository<SkillsEntity, Integer> {

}
