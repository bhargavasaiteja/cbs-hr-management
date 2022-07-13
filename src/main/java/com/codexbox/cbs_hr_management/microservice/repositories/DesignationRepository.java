package com.codexbox.cbs_hr_management.microservice.repositories;

import com.codexbox.cbs_hr_management.microservice.entities.DesignationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public  interface DesignationRepository extends CrudRepository<DesignationEntity, Integer> {
}
