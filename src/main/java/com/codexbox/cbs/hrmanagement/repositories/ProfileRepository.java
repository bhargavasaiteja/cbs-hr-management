package com.codexbox.cbs.hrmanagement.repositories;

import com.codexbox.cbs.hrmanagement.entities.ProfileEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProfileRepository extends CrudRepository<ProfileEntity,Integer> {

}
