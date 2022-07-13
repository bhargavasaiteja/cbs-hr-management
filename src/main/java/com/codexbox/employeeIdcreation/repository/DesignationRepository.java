package com.codexbox.employeeIdcreation.repository;

import com.codexbox.employeeIdcreation.entity.DesignationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public  interface DesignationRepository extends CrudRepository<DesignationEntity, Integer> {
}
