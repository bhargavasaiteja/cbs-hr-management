package com.codexbox.employeeIdcreation.users.repository;

import com.codexbox.employeeIdcreation.users.entities.BandEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BandRepo extends CrudRepository<BandEntity, Integer> {
}
