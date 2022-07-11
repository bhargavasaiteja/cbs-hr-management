package com.codexbox.cbs_onboarding_formalities.controller;
import com.codexbox.cbs_onboarding_formalities.entities.OfferStatusEntity;
import com.codexbox.cbs_onboarding_formalities.models.OfferStatusDTO;
import com.codexbox.cbs_onboarding_formalities.models.PersonalDetailsDTO;
import com.codexbox.cbs_onboarding_formalities.service.OfferStatusServiceImpl;
import com.codexbox.cbs_onboarding_formalities.service.PersonalDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonalDetailsController {
    @Autowired
    private PersonalDetailsServiceImpl personalDetailsService;
    @Autowired
     public OfferStatusServiceImpl offerStatusService;
    @PostMapping("/onboardingFormalities")
    public ResponseEntity<String>saveDetails(@RequestBody PersonalDetailsDTO personalDetailsDTO){
        String result = personalDetailsService.details(personalDetailsDTO);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

@GetMapping("/candidateStatus")
public ResponseEntity<List<OfferStatusDTO>> getCandidateDetails()
{
    return new ResponseEntity< >(offerStatusService.getDetails(),HttpStatus.OK );
}
}
