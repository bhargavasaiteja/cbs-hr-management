package com.codexbox.cbs.hrmanagement.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Entity
@Table(name="geo")
public class GeoEntity {
    @Id
    @Column(name="geo_id")
    private   Integer id;
    @Column(name="country_name")
    private String countryName;
}
