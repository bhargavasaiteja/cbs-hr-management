package com.codexbox.cbs_hr_management.microservice.services;

import com.codexbox.cbs_hr_management.microservice.repositories.StatusRepository;
import com.codexbox.cbs_hr_management.microservice.entities.StatusEntity;
import com.codexbox.cbs_hr_management.microservice.models.StatusModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StatusService {
    @Autowired
    private StatusRepository statusRepository;
    public List<StatusModel> getStatusDetails() {
        List<StatusEntity> entitylist = (List<StatusEntity>) statusRepository.findAll();
        List<StatusModel> statusModelsList = new ArrayList<>();
        entitylist.forEach(entity-> {
            StatusModel statusModel = new StatusModel();
            mapEntitytoModel(entity, statusModel);
            statusModelsList.add(statusModel);
        });
        return statusModelsList;
    }
    private void mapEntitytoModel(StatusEntity entity, StatusModel statusModel) {
        statusModel.setStatusId(entity.getStatusId());
        statusModel.setSelectStatus(entity.getSelectStatus());
    }
}
