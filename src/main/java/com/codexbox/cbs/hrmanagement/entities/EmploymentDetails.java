package com.codexbox.cbs.hrmanagement.entities;

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

    @Column(name="first_start_date")
    private Date firstStartDate;

    @Column(name="first_end_date")
    private Date firstEndDate;

    @Column(name="second_start_date")
    private Date secondStartDate;

    @Column(name="second_end_date")
    private Date secondEndDate;

    @Column(name="third_start_date")
    private Date thirdStartDate;

    @Column(name="third_end_date")
    private Date thirdEndDate;

    @Column(name="reason_for_relieving_from_current_organization")
    private String reason;





}
