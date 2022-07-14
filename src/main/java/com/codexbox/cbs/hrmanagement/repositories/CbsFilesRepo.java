package com.codexbox.cbs.hrmanagement.repositories;


import com.codexbox.cbs.hrmanagement.models.FileDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CbsFilesRepo extends CrudRepository<FileDTO,String> {
}
