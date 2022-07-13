package com.codexbox.employeeIdcreation.model;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class GeoDTO {
    private Integer id;
    private String countryName;

    }



