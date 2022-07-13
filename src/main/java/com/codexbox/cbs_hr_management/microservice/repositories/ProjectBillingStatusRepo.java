package com.codexbox.cbs_hr_management.microservice.repositories;

import com.codexbox.cbs_hr_management.microservice.entities.BillingStatusEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public  interface ProjectBillingStatusRepo  extends CrudRepository<BillingStatusEntity, Integer> {
}
