package com.codexbox.employee.hiring.users.repositories;

import com.codexbox.employee.hiring.users.entities.ProfileEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends CrudRepository<ProfileEntity,Integer> {

}
