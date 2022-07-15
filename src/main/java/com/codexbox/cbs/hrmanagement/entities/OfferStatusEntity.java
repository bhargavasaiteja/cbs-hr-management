package com.codexbox.cbs.hrmanagement.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Entity
@Table(name="offer_status")
public class OfferStatusEntity {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "candidate_status")
    private String candidatestatus;

}
