package com.codexbox.employeeIdcreation.repository;

import com.codexbox.employeeIdcreation.entity.BankAccountEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepo extends CrudRepository<BankAccountEntity, Long> {
}
