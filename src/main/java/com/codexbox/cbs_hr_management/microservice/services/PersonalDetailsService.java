package com.codexbox.cbs_hr_management.microservice.services;

import com.codexbox.cbs_hr_management.microservice.models.PersonalDetailsDTO;
import org.springframework.stereotype.Service;

@Service
public interface PersonalDetailsService  {
  String details(PersonalDetailsDTO personaldetailsDTO);
}
