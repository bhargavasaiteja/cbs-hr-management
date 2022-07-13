package com.codexbox.cbs.hrmanagement.services;

import com.codexbox.cbs.hrmanagement.models.PersonalDetailsDTO;
import org.springframework.stereotype.Service;

@Service
public interface PersonalDetailsService  {
  String details(PersonalDetailsDTO personaldetailsDTO);
}
