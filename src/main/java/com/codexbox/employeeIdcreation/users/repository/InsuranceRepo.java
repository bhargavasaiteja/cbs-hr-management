package com.codexbox.employeeIdcreation.users.repository;

import com.codexbox.employeeIdcreation.users.entities.InsuranceEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InsuranceRepo extends CrudRepository<InsuranceEntity, Integer> {
}
