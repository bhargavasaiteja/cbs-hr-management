package com.codexbox.cbs_hr_management.microservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_hiring")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeHiringEntity {
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="profile_id")
    private Integer profileId;

    @Column(name="zoom_or_google_meet")
    private String zoomOrGoogleMeet;

    @Column(name="interviewer_name")
    private String interviewerName;

    @Column(name="designation")
    private String designation;

    @Column(name="status_id")
    private Integer statusId;

    @Column(name="select_comments")
    private String comments;

}
