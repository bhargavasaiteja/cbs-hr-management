package com.codexbox.employee.hiring.employeeHiring.services;

import com.codexbox.employee.hiring.employeeHiring.entities.ProfileEntity;
import com.codexbox.employee.hiring.employeeHiring.models.ProfileModel;
import com.codexbox.employee.hiring.employeeHiring.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    public List<ProfileModel> getProfileDetails() {
        List<ProfileEntity> entitylist = (List<ProfileEntity>)profileRepository.findAll() ;
        List<ProfileModel> profileModelList = new ArrayList<>();
        entitylist.forEach(entity-> {
            ProfileModel profileModel = new ProfileModel();
            mapEntitytoModel(entity, profileModel);
            profileModelList.add(profileModel);
        });
        return profileModelList;
    }
    private void mapEntitytoModel(ProfileEntity entity, ProfileModel profileModel) {
        profileModel.setProfileSource(entity.getProfileSource());
        profileModel.setProfileId(entity.getProfileId());
    }
}
