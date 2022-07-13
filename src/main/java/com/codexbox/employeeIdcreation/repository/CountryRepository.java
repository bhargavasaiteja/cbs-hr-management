package com.codexbox.employeeIdcreation.repository;

import com.codexbox.employeeIdcreation.entity.GeoEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<GeoEntity,Integer> {

}
