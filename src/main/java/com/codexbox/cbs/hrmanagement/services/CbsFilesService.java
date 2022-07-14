package com.codexbox.cbs.hrmanagement.services;


import com.codexbox.cbs.hrmanagement.models.FileDTO;
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

    public FileDTO store(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        String filePath = filesDir + "/" + fileName;

        FileDTO fileDTO = new FileDTO();
        fileDTO.setFileId(UUID.randomUUID().toString());
        fileDTO.setFileName(fileName);
        fileDTO.setFilePath(filePath);
        FileUploadUtil.saveFile(filesDir, fileName, file);
       return  cbsFilesRepo.save(fileDTO);
    }

    public FileDTO getFileById(String id) {
        Optional<FileDTO> fileOptional = cbsFilesRepo.findById(id);
        if (fileOptional.isPresent()) {
            return fileOptional.get();
        }
        return null;
    }
    public List<FileDTO> getFileList(){
        return (List<FileDTO>) cbsFilesRepo.findAll();
    }
}