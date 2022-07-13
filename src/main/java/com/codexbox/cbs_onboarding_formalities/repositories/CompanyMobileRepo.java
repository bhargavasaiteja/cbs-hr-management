package com.codexbox.cbs_onboarding_formalities.repositories;

import com.codexbox.cbs_onboarding_formalities.entities.CompanyMobileEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyMobileRepo extends CrudRepository<CompanyMobileEntity, Integer> {
}
