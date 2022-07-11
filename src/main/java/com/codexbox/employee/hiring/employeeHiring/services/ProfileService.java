package com.codexbox.employee.hiring.employeeHiring.services;

import com.codexbox.employee.hiring.employeeHiring.entities.ProfileEntity;
import com.codexbox.employee.hiring.employeeHiring.models.ProfileModel;
import com.codexbox.employee.hiring.employeeHiring.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;
    public List<ProfileEntity> getProfileDetails() {
        return (List<ProfileEntity>) profileRepository.findAll();
    }
    public void mapEntityToModel(ProfileEntity profileEntity,ProfileModel profileModel){
        profileModel.setProfileId(profileEntity.getProfileId());
        profileModel.setProfileSource(profileEntity.getProfileSource());
    }
}
