package com.codexbox.cbs.hrmanagement.services;

import com.codexbox.cbs.hrmanagement.entities.OnboardingFormalitiesEntity;
import com.codexbox.cbs.hrmanagement.models.OnboardingFormalitiesDTO;
import com.codexbox.cbs.hrmanagement.repositories.OnboardingFormalitiesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OnBoardingFormalitiesServiceImpl implements OnBoardingFormalitiesService {
    @Autowired
    private OnboardingFormalitiesRepo onboardingFormalitiesRepo;
    @Override
    public String onBoardingFormalitiesDetails(OnboardingFormalitiesDTO personalDetailsDTO) {

        String status = "saved successfully";
        OnboardingFormalitiesEntity onboardingFormalitiesEntity = new OnboardingFormalitiesEntity();
        mapModelToEntity(personalDetailsDTO,onboardingFormalitiesEntity);
        OnboardingFormalitiesEntity result =onboardingFormalitiesRepo.save(onboardingFormalitiesEntity );
        if (result == null){
            status = "unsuccessfull";
        }
        return status;
    }
    private void mapModelToEntity(OnboardingFormalitiesDTO onboardingFormalitiesDTO , OnboardingFormalitiesEntity onboardingFormalitiesEntity)
    {
        onboardingFormalitiesEntity.setId(onboardingFormalitiesDTO.getId());
        onboardingFormalitiesEntity.setAgreedWithTerms(onboardingFormalitiesDTO.getAgreedwithterms());
        onboardingFormalitiesEntity.setSent(onboardingFormalitiesDTO.getSent());
        onboardingFormalitiesEntity.setPancard(onboardingFormalitiesDTO.getPancard());
        onboardingFormalitiesEntity.setAadharcard(onboardingFormalitiesDTO.getAadharcard());
        onboardingFormalitiesEntity.setCurrentaddress(onboardingFormalitiesDTO.getCurrentaddress());
        onboardingFormalitiesEntity.setPermanentaddress(onboardingFormalitiesDTO.getPermanentaddress());
        onboardingFormalitiesEntity.setName(onboardingFormalitiesDTO.getName());
        onboardingFormalitiesEntity.setDob(onboardingFormalitiesDTO.getDob());
        onboardingFormalitiesEntity.setGender(onboardingFormalitiesDTO.isGender());
        onboardingFormalitiesEntity.setPersonalemailid(onboardingFormalitiesDTO.getPersonalEmailId());
        onboardingFormalitiesEntity.setMobilenumber(onboardingFormalitiesDTO.getMobileNumber());
        onboardingFormalitiesEntity.setEmergencycontactnumber(onboardingFormalitiesDTO.getEmergencyContactNumber() );
        onboardingFormalitiesEntity.setBankaccount(onboardingFormalitiesDTO.getBankAccount());
        onboardingFormalitiesEntity.setBloodGroup(onboardingFormalitiesDTO.getBloodGroup());
        onboardingFormalitiesEntity.setMaritialStatus(onboardingFormalitiesDTO.isMaritalStatus());
        onboardingFormalitiesEntity.setFatherName(onboardingFormalitiesDTO.getFatherName());
        onboardingFormalitiesEntity.setMotherName(onboardingFormalitiesDTO.getMotherName());
        onboardingFormalitiesEntity.setSpouseName(onboardingFormalitiesDTO.getSpouseName());
        onboardingFormalitiesEntity.setChildren1(onboardingFormalitiesDTO.getChildren1());
        onboardingFormalitiesEntity.setChildren2(onboardingFormalitiesDTO.getChildren2());
        onboardingFormalitiesEntity.setSscPercentage(onboardingFormalitiesDTO.getSscPercentage());
        onboardingFormalitiesEntity.setIntermediatePercentage(onboardingFormalitiesDTO.getIntermediatePercentage());
        onboardingFormalitiesEntity.setIntermediateSpecialization(onboardingFormalitiesDTO.getIntermediateSpecialization());
        onboardingFormalitiesEntity.setUgPercentage(onboardingFormalitiesDTO.getUgPercentage());
        onboardingFormalitiesEntity.setUgSpecialization(onboardingFormalitiesDTO.getUgSpecialization());
        onboardingFormalitiesEntity.setPgPercentage(onboardingFormalitiesDTO.getPgPercentage());
        onboardingFormalitiesEntity.setPgSpecialization(onboardingFormalitiesDTO.getPgSpecialization());
        onboardingFormalitiesEntity.setDrPercentage(onboardingFormalitiesDTO.getDrPercentage());
        onboardingFormalitiesEntity.setDrSpecialization(onboardingFormalitiesDTO.getDrSpecialization());
        onboardingFormalitiesEntity.setEmpid(onboardingFormalitiesDTO.getEmpId());
        onboardingFormalitiesEntity.setFirstStartDate(onboardingFormalitiesDTO.getFirstStartDate());
        onboardingFormalitiesEntity.setFirstEndDate(onboardingFormalitiesDTO.getFirstEndDate());
        onboardingFormalitiesEntity.setSecondStartDate(onboardingFormalitiesDTO.getSecondStartDate());
        onboardingFormalitiesEntity.setSecondEndDate(onboardingFormalitiesDTO.getSecondEndDate());
        onboardingFormalitiesEntity.setThirdStartDate(onboardingFormalitiesDTO.getThirdStartDate());
        onboardingFormalitiesEntity.setThirdEndDate(onboardingFormalitiesDTO.getThirdEndDate());
        onboardingFormalitiesEntity.setReason(onboardingFormalitiesDTO.getReason());
    }
}
