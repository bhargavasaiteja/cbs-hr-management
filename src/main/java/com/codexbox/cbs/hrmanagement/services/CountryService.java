package com.codexbox.cbs.hrmanagement.services;

import com.codexbox.cbs.hrmanagement.repositories.CountryRepository;
import com.codexbox.cbs.hrmanagement.entities.GeoEntity;
import com.codexbox.cbs.hrmanagement.models.GeoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;
    public List<GeoDTO> getGeoDetails() {
        List<GeoEntity> geoEntityList = (List<GeoEntity>) countryRepository.findAll();
        List<GeoDTO> geoDTOList = new ArrayList<>();
        geoEntityList.forEach(geoObj -> {
            GeoDTO geoDTO = new GeoDTO();
            mapEntityToGeoDetails(geoDTO, geoObj);
            geoDTOList.add(geoDTO);

        });
        return geoDTOList;
    }

    public void mapEntityToGeoDetails(GeoDTO geoDTO, GeoEntity geo) {
        geoDTO.setId(geo.getId());
        geoDTO.setCountryName(geo.getCountryName());
    }

}
