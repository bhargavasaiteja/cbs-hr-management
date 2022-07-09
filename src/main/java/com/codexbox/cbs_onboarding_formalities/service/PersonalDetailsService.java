package com.codexbox.cbs_onboarding_formalities.service;

import com.codexbox.cbs_onboarding_formalities.model.PersonalDetailsDTO;
import org.springframework.stereotype.Service;

@Service
public interface PersonalDetailsService  {

     void details(PersonalDetailsDTO personaldetailsDTO);
}
