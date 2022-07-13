package com.codexbox.cbs_hr_management.microservice.services;


import com.codexbox.cbs_hr_management.microservice.repositories.PersonalDetailsRepo;
import com.codexbox.cbs_hr_management.microservice.entities.PersonalDetailsEntity;
import com.codexbox.cbs_hr_management.microservice.models.PersonalDetailsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalDetailsServiceImpl implements PersonalDetailsService {
    @Autowired
    private PersonalDetailsRepo personalDetailsRepo;

    @Override
    public String details(PersonalDetailsDTO personaldetailsDTO) {
        String status = "save successfully";
        PersonalDetailsEntity personalDetailsEntity = new PersonalDetailsEntity();
        mapModelintoEntity(personaldetailsDTO,personalDetailsEntity);
        PersonalDetailsEntity  result =personalDetailsRepo.save(personalDetailsEntity );
        if (result == null){
            status = "unsuccessfull";
        }
        return status;
    }
    private void mapModelintoEntity(PersonalDetailsDTO personaldetailsDTO , PersonalDetailsEntity personalDetailsEntity)
    {
        personalDetailsEntity.setId(personaldetailsDTO.getId());
        personalDetailsEntity.setPancard(personaldetailsDTO.getPancard());
        personalDetailsEntity.setAadharcard(personaldetailsDTO.getAadharcard());
        personalDetailsEntity.setCurrentaddress(personaldetailsDTO.getCurrentaddress());
        personalDetailsEntity.setPermanentaddress(personaldetailsDTO.getPermanentaddress());
        personalDetailsEntity.setName(personaldetailsDTO.getName());
        personalDetailsEntity.setDob(personaldetailsDTO.getDob());
        personalDetailsEntity.setGender(personaldetailsDTO.isGender());
        personalDetailsEntity.setPersonalemailid(personaldetailsDTO.getPersonalemailid());
        personalDetailsEntity.setMobilenumber(personaldetailsDTO.getMobilenumber());
        personalDetailsEntity.setEmergencycontactnumber(personaldetailsDTO.getEmergencycontactnumber() );
        personalDetailsEntity.setBankaccount(personaldetailsDTO.getBankaccount());
        personalDetailsEntity.setBloodgroup(personaldetailsDTO.getBloodgroup());
        personalDetailsEntity.setMaritialstatus(personaldetailsDTO.isMaritialstatus());
        personalDetailsEntity.setFathername(personaldetailsDTO.getFathername());
        personalDetailsEntity.setMothername(personaldetailsDTO.getMothername());
        personalDetailsEntity.setSpousename(personaldetailsDTO.getSpousename());
        personalDetailsEntity.setChildren1(personaldetailsDTO.getChildren1());
        personalDetailsEntity.setChildren2(personalDetailsEntity.getChildren2());


    }


}

