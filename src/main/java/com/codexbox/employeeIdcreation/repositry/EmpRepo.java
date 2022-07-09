package com.codexbox.employeeIdcreation.repositry;

import com.codexbox.employeeIdcreation.entity.EmpEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmpRepo extends CrudRepository<EmpEntity,Integer> {

}
