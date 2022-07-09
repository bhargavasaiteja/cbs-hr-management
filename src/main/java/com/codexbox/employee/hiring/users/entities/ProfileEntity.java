package com.codexbox.employee.hiring.users.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profile_dropdown")
public class ProfileEntity {
    @Id
    @Column(name="profile_id" , nullable = true)
    private Integer profileId;

    @Column(name="profile_source")
    private String profileSource;

    public Integer getProfileId() {
        return profileId;
    }

    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    public String getProfileSource() {
        return profileSource;
    }

    public void setProfileSource(String profileSource) {
        this.profileSource = profileSource;
    }
}
