package com.codexbox.cbs_onboarding_formalities.controller;
import com.codexbox.cbs_onboarding_formalities.entities.Education;
import com.codexbox.cbs_onboarding_formalities.models.EducationDTO;
import com.codexbox.cbs_onboarding_formalities.models.EmploymentDTO;
import com.codexbox.cbs_onboarding_formalities.models.OfferStatusDTO;
import com.codexbox.cbs_onboarding_formalities.models.PersonalDetailsDTO;
import com.codexbox.cbs_onboarding_formalities.services.EducationServiceImpl;
import com.codexbox.cbs_onboarding_formalities.services.EmploymentServiceImpls;
import com.codexbox.cbs_onboarding_formalities.services.OfferStatusServiceImpl;
import com.codexbox.cbs_onboarding_formalities.services.PersonalDetailsServiceImpl;
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
    @Autowired
    EmploymentServiceImpls employmentServiceImpls;
    @Autowired
    private EducationServiceImpl educationServiceImpl;
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
    @PostMapping("/employmentdetails")
    public ResponseEntity<String> saveEmployeeDetails(@RequestBody EmploymentDTO employmentDTO){
        String emp =employmentServiceImpls.saveEmploymentService(employmentDTO);
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }
    @PostMapping("/educationdetails")
    public ResponseEntity<Education> saveEducationDetails(@RequestBody EducationDTO educationDTO) {
        educationServiceImpl.educationDetails(educationDTO);
        return new ResponseEntity<>(HttpStatus.ACCEPTED) ;
    }
}
