package com.codexbox.cbs.hrmanagement.repositories;

import com.codexbox.cbs.hrmanagement.entities.OfferStatusEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferStatusRepo extends CrudRepository<OfferStatusEntity,Integer> {

}
