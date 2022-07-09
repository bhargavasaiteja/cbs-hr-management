package com.codexbox.cbs_onboarding_formalities.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="employment_details")
@Data
public class CbsEmploymentEntity {

    @Id
    private Integer id;

    @Column(name="first_employment")
    private String address;



    @Column(name="first_StartDate")
    private String firstStartDate;

    @Column(name="first_enddate")
    private String firstEndDate;

    @Column(name="second_employment")
    private String city;

    @Column(name="second_StartDate")
    private String country;

    @Column(name="second_enddate")
    private String zipCode;

   /* @OneToOne
    @MapsId*/
   // private User user;

}
