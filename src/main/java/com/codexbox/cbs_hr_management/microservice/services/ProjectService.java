package com.codexbox.cbs_hr_management.microservice.services;

import com.codexbox.cbs_hr_management.microservice.repositories.ProjectRepository;
import com.codexbox.cbs_hr_management.microservice.entities.ProjectEntity;
import com.codexbox.cbs_hr_management.microservice.models.ProjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProjectService {
    @Autowired
    ProjectRepository projectRepository;
    public List<ProjectDTO> getProjectDetails() {
        List<ProjectEntity> projectList = (List<ProjectEntity>) projectRepository.findAll();
        List<ProjectDTO> projectDTOList = new ArrayList<>();
        projectList.forEach(projectObj -> {
            ProjectDTO projectDTO = new ProjectDTO();
            mapEntityToProjectDetails(projectDTO, projectObj);
            projectDTOList.add(projectDTO);

        });
        return projectDTOList;
    }
    public void mapEntityToProjectDetails(ProjectDTO projectDTO, ProjectEntity projectEntity){
        projectDTO.setStatusId(projectEntity.getStatusId());
        projectDTO.setStatusName(projectEntity.getStatusName());
    }

}
