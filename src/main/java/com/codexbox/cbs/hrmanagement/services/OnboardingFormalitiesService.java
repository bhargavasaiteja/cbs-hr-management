package com.codexbox.cbs.hrmanagement.services;

import com.codexbox.cbs.hrmanagement.models.OnboardingFormalitiesDTO;
import org.springframework.stereotype.Service;

@Service
public interface OnboardingFormalitiesService {
  String details(OnboardingFormalitiesDTO personaldetailsDTO);
}
