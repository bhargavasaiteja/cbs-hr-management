package com.codexbox.employeeIdcreation.repository;

import com.codexbox.employeeIdcreation.entity.EmpEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmpRepo extends CrudRepository<EmpEntity,Integer> {

}
