package com.codexbox.cbs.hrmanagement.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Entity
@Table(name="Project")
public class ProjectEntity {

    @Id
    @Column(name="status_id")
    private Integer statusId;

    @Column(name="status_name")
    private String statusName;

}
