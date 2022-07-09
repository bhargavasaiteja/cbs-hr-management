package com.codexbox.employee.hiring.employeeHiring.repositories;

import com.codexbox.employee.hiring.employeeHiring.entities.EmployeeHiringEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeHiringRepositories extends CrudRepository<EmployeeHiringEntity, Long> {
}
