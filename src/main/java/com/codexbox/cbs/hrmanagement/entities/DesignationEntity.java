package com.codexbox.cbs.hrmanagement.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Entity
@Table(name = "designation")

public class DesignationEntity {
    @Id
    @Column(name = "designation_id")
    private Integer id;

    @Column(name = "designation_name")
    private String designatitonName;

}
