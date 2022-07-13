package com.codexbox.cbs_hr_management.microservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="offer_status")
public class OfferStatusEntity {
    @Id
    @Column(name = "id" )
    private int id;
    @Column(name= "candidate_status")
    private String candidatestatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCandidatestatus() {
        return candidatestatus;
    }

    public void setCandidatestatus(String candidatestatus) {
        this.candidatestatus = candidatestatus;
    }
}
