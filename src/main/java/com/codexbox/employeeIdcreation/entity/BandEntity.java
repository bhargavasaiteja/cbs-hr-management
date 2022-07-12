package com.codexbox.employeeIdcreation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="band")
public class BandEntity {
    @Id
    @Column(name = "band_id")
    private Integer bandId;
    @Column(name = "band_name")
    private String bandName;

    public Integer getBandId() {
        return bandId;
    }

    public void setBandId(Integer bandId) {
        this.bandId = bandId;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
}
