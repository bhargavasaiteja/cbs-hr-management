package com.codexbox.employee.hiring.employeeHiring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "employee_hiring")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeHiringEntity {
    @Id
    @Column(name="profile_id")
    private Integer profileId;

    @Column(name="zoom_or_googlemeet")
    private String zoomOrGoogleMeet;

    @Column(name="interviewer_name")
    private String interviewerName;

    @Column(name="designation")
    private String designation;

    @Column(name="status_id")
    private Integer statusId;

    @Column(name="comments")
    private String comments;
}
