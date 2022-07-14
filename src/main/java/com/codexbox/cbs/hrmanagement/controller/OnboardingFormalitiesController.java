package com.codexbox.cbs.hrmanagement.controller;
import com.codexbox.cbs.hrmanagement.services.OfferStatusServiceImpl;
import com.codexbox.cbs.hrmanagement.services.OnboardingFormalitiesServiceImpl;
import com.codexbox.cbs.hrmanagement.models.OfferStatusDTO;
import com.codexbox.cbs.hrmanagement.models.OnboardingFormalitiesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OnboardingFormalitiesController {
    @Autowired
    private OnboardingFormalitiesServiceImpl onboardingFormalitiesService;
    @Autowired
     public OfferStatusServiceImpl offerStatusService;

    @PostMapping("/onboardingFormalities")
    public ResponseEntity<String>saveDetails(@RequestBody OnboardingFormalitiesDTO onboardingFormalitiesDTO){
        String result = onboardingFormalitiesService.details(onboardingFormalitiesDTO);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @GetMapping("/candidateStatus")
    public ResponseEntity<List<OfferStatusDTO>> getCandidateDetails()
    {
        return new ResponseEntity< >(offerStatusService.getDetails(),HttpStatus.OK );
    }

}
