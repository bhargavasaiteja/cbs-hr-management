package com.codexbox.employeeIdcreation.repository;

import com.codexbox.employeeIdcreation.entity.SkillsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends CrudRepository<SkillsEntity, Integer> {

}
