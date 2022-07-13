package com.codexbox.cbs_onboarding_formalities.repositories;

import com.codexbox.cbs_onboarding_formalities.entities.PersonalDetailsEntity;
import com.codexbox.cbs_onboarding_formalities.entities.EmploymentDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalDetailsRepo extends CrudRepository<PersonalDetailsEntity,Integer>{


}
