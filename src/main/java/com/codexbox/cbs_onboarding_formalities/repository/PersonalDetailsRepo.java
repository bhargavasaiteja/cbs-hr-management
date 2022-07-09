package com.codexbox.cbs_onboarding_formalities.repository;

import com.codexbox.cbs_onboarding_formalities.entities.PersonalDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalDetailsRepo extends CrudRepository<PersonalDetails,Integer>{


}
