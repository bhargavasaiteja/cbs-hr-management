package com.codexbox.employeeIdcreation.repository;
import com.codexbox.employeeIdcreation.entity.DepartmentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public  interface DepartmentRepo extends CrudRepository<DepartmentEntity,Integer>{
}
