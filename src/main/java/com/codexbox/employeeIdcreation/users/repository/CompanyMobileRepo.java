package com.codexbox.employeeIdcreation.users.repository;

import com.codexbox.employeeIdcreation.users.entities.CompanyMobileEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyMobileRepo extends CrudRepository<CompanyMobileEntity, Integer> {
}
