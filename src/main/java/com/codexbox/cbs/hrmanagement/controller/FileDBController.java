package com.codexbox.cbs.hrmanagement.controller;
import com.codexbox.cbs.hrmanagement.entities.CbsFileUploadEntity;
import com.codexbox.cbs.hrmanagement.services.CbsFilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/file")
public class FileDBController {


    @Autowired
    private CbsFilesService fileDBService;

    @PostMapping("/upload")
    public CbsFileUploadEntity uploadFile(@RequestParam("file")MultipartFile file) throws IOException {

        return fileDBService.store(file);

    }
    @GetMapping("/{id}")
    public CbsFileUploadEntity getFile(@PathVariable String id){
        return fileDBService.getFileById(id);
    }
    @GetMapping("/list")
    public List<CbsFileUploadEntity> getFileList(){
        return fileDBService.getFileList();
    }



}
