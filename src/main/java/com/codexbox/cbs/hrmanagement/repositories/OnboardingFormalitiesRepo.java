package com.codexbox.cbs.hrmanagement.repositories;

import com.codexbox.cbs.hrmanagement.entities.OnboardingFormalitiesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnboardingFormalitiesRepo extends CrudRepository<OnboardingFormalitiesEntity,Integer>{


}
