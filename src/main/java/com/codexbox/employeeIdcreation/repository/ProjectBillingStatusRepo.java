package com.codexbox.employeeIdcreation.repository;
import com.codexbox.employeeIdcreation.entity.BillingStatusEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public  interface ProjectBillingStatusRepo  extends CrudRepository<BillingStatusEntity, Integer> {
}
