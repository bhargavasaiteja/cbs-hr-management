package com.codexbox.employeeIdcreation.repository;

import com.codexbox.employeeIdcreation.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends CrudRepository<EmployeeEntity,Integer> {
}
