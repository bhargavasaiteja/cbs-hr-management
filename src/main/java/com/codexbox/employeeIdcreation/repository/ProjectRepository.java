package com.codexbox.employeeIdcreation.repository;

import com.codexbox.employeeIdcreation.entity.ProjectEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<ProjectEntity,Integer> {

}
