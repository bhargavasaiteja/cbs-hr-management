package com.codexbox.employeeIdcreation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class DesignationEntity {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "designation_name")
    private String designatitonName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesignatitonName() {
        return designatitonName;
    }

    public void setDesignatitonName(String designatitonName) {
        this.designatitonName = designatitonName;
    }
}
