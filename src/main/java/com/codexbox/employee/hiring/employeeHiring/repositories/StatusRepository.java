package com.codexbox.employee.hiring.employeeHiring.repositories;

import com.codexbox.employee.hiring.employeeHiring.entities.StatusEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StatusRepository extends CrudRepository<StatusEntity,Integer> {
}
