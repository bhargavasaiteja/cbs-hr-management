package com.codexbox.cbs.hrmanagement.services;

import com.codexbox.cbs.hrmanagement.repositories.ProjectBillingStatusRepo;
import com.codexbox.cbs.hrmanagement.entities.BillingStatusEntity;
import com.codexbox.cbs.hrmanagement.models.BillingStatusDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BillingService {
    @Autowired
    public ProjectBillingStatusRepo repo;
    public List<BillingStatusDTO> getBillingDetails() {
        List<BillingStatusEntity> entityList = (List<BillingStatusEntity>) repo.findAll();
        List<BillingStatusDTO> billingDTOList = new ArrayList<>();
        entityList.forEach(entity -> {
            BillingStatusDTO billingStatusDTO = new BillingStatusDTO();
            MapModelToBillingStatusEntity(entity, billingStatusDTO);
            billingDTOList.add(billingStatusDTO);
        });
        return billingDTOList;
    }
    private void MapModelToBillingStatusEntity(BillingStatusEntity billingStatusEntity, BillingStatusDTO billingStatusDTO) {
        billingStatusDTO.setProjectId(billingStatusEntity.getProjectId());
        billingStatusDTO.setProjectBillingStatus(billingStatusEntity.getProjectStatus());
    }
}
