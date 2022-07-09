package com.codexbox.employee.hiring.users.repositories;

import com.codexbox.employee.hiring.users.entities.StatusEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends CrudRepository<StatusEntity,Integer> {
}
