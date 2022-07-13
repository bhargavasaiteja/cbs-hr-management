package com.codexbox.cbs_onboarding_formalities.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profile_dropdown")
@Data
public class ProfileEntity {
    @Id
    @Column(name="profile_id" , nullable = true)
    private Integer profileId;

    @Column(name="profile_source")
    private String profileSource;

}
