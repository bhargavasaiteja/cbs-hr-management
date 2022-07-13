package com.codexbox.employeeIdcreation.repository;

import com.codexbox.employeeIdcreation.entity.BandEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BandRepo extends CrudRepository<BandEntity, Integer> {
}
