package com.codexbox.employeeIdcreation.service;
import com.codexbox.employeeIdcreation.entity.BillingStatusEntity;
import com.codexbox.employeeIdcreation.model.ProjectBillingStatusDTO;
import com.codexbox.employeeIdcreation.repository.ProjectBillingStatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class ProjectStatusBillingService {
    @Autowired
    public ProjectBillingStatusRepo repo;
    @Autowired
    public ProjectBillingStatusDTO projectBillingStatusDTO;
    public List<ProjectBillingStatusDTO> getProjectDetails(){
        List<ProjectBillingStatusDTO> billingDTOList = new ArrayList<>();
        List<BillingStatusEntity> entityList = (List<BillingStatusEntity>) repo.findAll();
        entityList.forEach(entity->{
            MapModelToBillingStatusEntity(entity,projectBillingStatusDTO);
            billingDTOList.add(projectBillingStatusDTO);
        });
        return billingDTOList;
    }
    private void MapModelToBillingStatusEntity(BillingStatusEntity billingStatusEntity, ProjectBillingStatusDTO projectBillingStatusDTO) {
        projectBillingStatusDTO.setProjectId(billingStatusEntity.getProjectId());
        projectBillingStatusDTO.setProjectStatus(billingStatusEntity.getProjectStatus());
    }

}
