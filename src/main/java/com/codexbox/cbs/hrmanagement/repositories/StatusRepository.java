package com.codexbox.cbs.hrmanagement.repositories;

import com.codexbox.cbs.hrmanagement.entities.StatusEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StatusRepository extends CrudRepository<StatusEntity,Integer> {
}
