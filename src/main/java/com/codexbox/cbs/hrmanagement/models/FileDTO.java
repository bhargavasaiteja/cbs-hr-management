package com.codexbox.cbs.hrmanagement.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FILES")
@Data
public class FileDTO {

    @Id
    @Column(name = "file_id")
    private String fileId;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_type")
    private String type;

    @Column(name = "file_path")
    private String filePath;

}
