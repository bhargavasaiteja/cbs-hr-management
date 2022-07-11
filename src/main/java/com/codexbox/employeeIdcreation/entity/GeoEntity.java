package com.codexbox.employeeIdcreation.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Geo")
@Data
public class GeoEntity {
    @Id
     @Column(name="id")
  private   Integer id;
    @Column(name="country_name")
    private String countryName;
}
