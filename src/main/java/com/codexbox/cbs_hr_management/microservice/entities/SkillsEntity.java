package com.codexbox.cbs_hr_management.microservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "skills")
public class SkillsEntity {
    @Id
    @Column(name = "skill_id")
    private int id;
    @Column(name = "skills_name")
    private String skillsName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSkillsName() {
        return skillsName;
    }

    public void setSkillsName(String skillsName) {
        this.skillsName = skillsName;
    }
}
