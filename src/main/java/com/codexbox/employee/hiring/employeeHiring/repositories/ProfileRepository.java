package com.codexbox.employee.hiring.employeeHiring.repositories;

import com.codexbox.employee.hiring.employeeHiring.entities.ProfileEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProfileRepository extends CrudRepository<ProfileEntity,Integer> {

}
