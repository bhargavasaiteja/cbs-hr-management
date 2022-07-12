package com.codexbox.employeeIdcreation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SkillsEntity {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "skills_name")
    private String skillsname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSkillsname() {
        return skillsname;
    }

    public void setSkillsname(String skillsname) {
        this.skillsname = skillsname;
    }
}
