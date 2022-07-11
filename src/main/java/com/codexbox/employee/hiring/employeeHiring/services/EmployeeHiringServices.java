package com.codexbox.employee.hiring.employeeHiring.services;

import com.codexbox.employee.hiring.employeeHiring.entities.EmployeeHiringEntity;
import com.codexbox.employee.hiring.employeeHiring.models.EmployeeHiringModel;
import com.codexbox.employee.hiring.employeeHiring.repositories.EmployeeHiringRepositories;
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
        entity.setProfileId(model.getProfileId());
        entity.setZoomOrGoogleMeet(model.getZoomOrGoogleMeet());
        entity.setInterviewerName(model.getInterviewerName());
        entity.setDesignation(model.getDesignation());
        entity.setProfileId(model.getProfileId());
        entity.setComments(model.getComments());
        }
    }

