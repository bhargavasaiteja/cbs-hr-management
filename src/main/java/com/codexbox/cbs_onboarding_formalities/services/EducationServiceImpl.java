package com.codexbox.cbs_onboarding_formalities.services;

import com.codexbox.cbs_onboarding_formalities.entities.Education;
import com.codexbox.cbs_onboarding_formalities.models.EducationDTO;
import com.codexbox.cbs_onboarding_formalities.repositories.EducationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationServiceImpl implements EducationService {
    @Autowired
    private EducationRepo educationRepo;

    @Override
    public String educationDetails(EducationDTO educationDTO) {
        String status = "education details is not saved";
        Education education = new Education();
        mappingModelToEntity(educationDTO, education);
        educationRepo.save(education);
        if (education != null) {
            status = "education details saved ";
        }

        return status;
    }

    private void mappingModelToEntity(EducationDTO educationDTO, Education education) {
        education.setId(educationDTO.getId());
        education.setSscPercentage(educationDTO.getSscPercentage());
        education.setIntermediatePercentage(educationDTO.getIntermediatePercentage());
        education.setIntermediateSpecialization(educationDTO.getIntermediateSpecialization());
        education.setUgPercentage(educationDTO.getUgPercentage());
        education.setUgSpecialization(educationDTO.getUgSpecialization());
        education.setPgPercentage(educationDTO.getPgPercentage());
        education.setPgSpecialization(educationDTO.getPgSpecialization());
        education.setDrPercentage(educationDTO.getDrPercentage());
        education.setDrSpecialization(educationDTO.getDrSpecialization());
    }
}

