package com.codexbox.cbs_onboarding_formalities.repositories;

import com.codexbox.cbs_onboarding_formalities.entities.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends CrudRepository<EmployeeEntity,Integer> {
}
