package com.codexbox.employee.hiring.employeeHiring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hiring")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeHiringEntity {
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="profiles")
    private String profiles;

    @Column(name="zoom_or_googlemeet")
    private String zoomOrGoogleMeet;

    @Column(name="interviewer_name")
    private String interviewerName;

    @Column(name="designation")
    private String designation;

    @Column(name="feed_back")
    private String feedback;

    @Column(name="comments")
    private String comments;
}
