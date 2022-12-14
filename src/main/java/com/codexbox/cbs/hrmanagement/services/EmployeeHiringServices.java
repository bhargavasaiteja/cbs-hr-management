package com.codexbox.cbs.hrmanagement.services;

import com.codexbox.cbs.hrmanagement.repositories.EmployeeHiringRepositories;
import com.codexbox.cbs.hrmanagement.entities.EmployeeHiringEntity;
import com.codexbox.cbs.hrmanagement.models.EmployeeHiringModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@Service
public class EmployeeHiringServices {
    @Autowired
    private EmployeeHiringRepositories repo;
    @Transactional
    public String saveEmployeehiringDetails(EmployeeHiringModel details) {
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

