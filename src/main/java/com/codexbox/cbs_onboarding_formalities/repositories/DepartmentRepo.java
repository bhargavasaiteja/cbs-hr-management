package com.codexbox.cbs_onboarding_formalities.repositories;

import com.codexbox.cbs_onboarding_formalities.entities.DepartmentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public  interface DepartmentRepo extends CrudRepository<DepartmentEntity,Integer>{
}
