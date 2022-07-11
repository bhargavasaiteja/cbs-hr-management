package com.codexbox.employee.hiring.employeeHiring.entities;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="status_dropdown")
@Data
public class StatusEntity {
    @Id
    @Column(name="status_id" , nullable = true)
    private Integer statusId;

    @Column(name="select_status")
    private String selectStatus;
}
