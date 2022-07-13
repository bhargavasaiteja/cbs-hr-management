package com.codexbox.employeeIdcreation.repository;

import com.codexbox.employeeIdcreation.entity.InsuranceEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceRepo extends CrudRepository<InsuranceEntity, Integer> {
}
