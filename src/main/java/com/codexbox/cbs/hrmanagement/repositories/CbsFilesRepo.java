package com.codexbox.cbs.hrmanagement.repositories;


import com.codexbox.cbs.hrmanagement.entities.CbsFileUploadEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CbsFilesRepo extends CrudRepository<CbsFileUploadEntity,String> {
}
