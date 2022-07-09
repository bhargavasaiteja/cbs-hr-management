package com.codexbox.cbs_onboarding_formalities.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name="employment_details")
public class EmploymentDetails {

    @Id
    @Column(name="emp_id")
    private Integer empid;

    @Column(name="first_StartDate")
    private Date firstStartDate;

    @Column(name="first_enddate")
    private Date firstEndDate;

    @Column(name="second_StartDate")
    private Date secondStartDate;

    @Column(name="second_enddate")
    private Date secondEndDate;

    @Column(name="third_StartDate")
    private Date thirdStartDate;

    @Column(name="third_enddate")
    private Date thirdEndDate;

    @Column(name="Reasonforrelievingfromcurrentorganization")
    private String reason;




/* @OneToOne
    @MapsId*/
   // private User user;

}
