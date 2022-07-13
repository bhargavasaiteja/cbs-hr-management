package com.codexbox.cbs.hrmanagement.repositories;

import com.codexbox.cbs.hrmanagement.entities.EmploymentDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmploymentRepo extends CrudRepository<EmploymentDetails,Integer> {
}
