package com.codexbox.cbs.hrmanagement.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Entity
@Table(name = "skills")
public class SkillsEntity {
    @Id
    @Column(name = "skill_id")
    private int id;

    @Column(name = "skills_name")
    private String skillsName;

}
