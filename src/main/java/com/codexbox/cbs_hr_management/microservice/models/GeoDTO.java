package com.codexbox.cbs_hr_management.microservice.models;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class GeoDTO {
    private Integer id;
    private String countryName;

    }



