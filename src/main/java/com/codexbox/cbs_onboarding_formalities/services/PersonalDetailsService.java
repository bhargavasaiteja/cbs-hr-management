package com.codexbox.cbs_onboarding_formalities.services;

import com.codexbox.cbs_onboarding_formalities.models.PersonalDetailsDTO;
import org.springframework.stereotype.Service;

@Service
public interface PersonalDetailsService  {
  String details(PersonalDetailsDTO personaldetailsDTO);
}
