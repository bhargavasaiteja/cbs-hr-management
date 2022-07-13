package com.codexbox.cbs_onboarding_formalities.services;

import com.codexbox.cbs_onboarding_formalities.entities.EmployeeHiringEntity;
import com.codexbox.cbs_onboarding_formalities.models.EmployeeHiringModel;
import com.codexbox.cbs_onboarding_formalities.repositories.EmployeeHiringRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@Service
public class EmployeeHiringServices {
    @Autowired
    private EmployeeHiringRepositories repo;
    @Transactional
    public String saveSubmitDetails(EmployeeHiringModel details) {
        String status = "Submit details are Successfully";
        EmployeeHiringEntity entity=new EmployeeHiringEntity();
        mappingMethod(details,entity);
        entity=repo.save(entity);
        if(entity==null){
            status="Unsuccesfull";
        }
        return status;
    }
    public void mappingMethod(EmployeeHiringModel model, EmployeeHiringEntity entity){
        entity.setId(model.getId());
        entity.setProfileId(model.getProfileId());
        entity.setZoomOrGoogleMeet(model.getZoomOrGoogleMeet());
        entity.setInterviewerName(model.getInterviewerName());
        entity.setDesignation(model.getDesignation());
        entity.setStatusId(model.getStatusId());
        entity.setComments(model.getComments());
    }
}

