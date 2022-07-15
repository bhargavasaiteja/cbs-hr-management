package com.codexbox.cbs.hrmanagement.services;


import com.codexbox.cbs.hrmanagement.entities.CbsFileUploadEntity;
import com.codexbox.cbs.hrmanagement.repositories.CbsFilesRepo;
import com.codexbox.cbs.hrmanagement.util.FileUploadUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CbsFilesService {
    @Autowired
    private CbsFilesRepo cbsFilesRepo;
    @Value("${cbs.files.dir}")
    String filesDir;
    public CbsFileUploadEntity store(MultipartFile file) throws IOException {

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        String filePath = filesDir + "/" + fileName;

        CbsFileUploadEntity cbsFileUploadEntity = new CbsFileUploadEntity();
        cbsFileUploadEntity.setFileId(UUID.randomUUID().toString());
        cbsFileUploadEntity.setFileName(fileName);
        cbsFileUploadEntity.setFilePath(filePath);
        FileUploadUtil.saveFile(filesDir, fileName, file);
       return  cbsFilesRepo.save(cbsFileUploadEntity);
    }
    public CbsFileUploadEntity getFileById(String id) {
        Optional<CbsFileUploadEntity> fileOptional = cbsFilesRepo.findById(id);
        if (fileOptional.isPresent()) {
            return fileOptional.get();
        }
        return null;
    }
    public List<CbsFileUploadEntity> getFileList(){
        return (List<CbsFileUploadEntity>) cbsFilesRepo.findAll();
    }
}