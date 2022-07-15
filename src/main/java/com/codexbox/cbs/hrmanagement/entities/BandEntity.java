package com.codexbox.cbs.hrmanagement.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Entity
@Table(name="band")
public class BandEntity {
    @Id
    @Column(name = "band_id")
    private Integer bandId;
    @Column(name = "band_name")
    private String bandName;
}
