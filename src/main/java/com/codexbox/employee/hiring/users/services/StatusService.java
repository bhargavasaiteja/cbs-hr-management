package com.codexbox.employee.hiring.users.services;
import com.codexbox.employee.hiring.users.entities.StatusEntity;
import com.codexbox.employee.hiring.users.models.StatusModel;
import com.codexbox.employee.hiring.users.repositories.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StatusService {
    @Autowired
    private StatusRepository statusRepository;

    public List<StatusEntity> getStatusDetails() {
        return (List<StatusEntity>) statusRepository.findAll();
    }

    public void mappingEntityToModel(StatusEntity statusEntity, StatusModel statusModel){
       statusModel.setStatusId(statusEntity.getStatusId());
       statusModel.setSelectStatus(statusEntity.getSelectStatus());
    }
}
