package com.codexbox.employeeIdcreation.users.entities;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Entity
@Table(name="band")
public class BandEntity {
    @Id
    private Integer id;
    @Column(name = "band_name")
    private String bandName;
}
