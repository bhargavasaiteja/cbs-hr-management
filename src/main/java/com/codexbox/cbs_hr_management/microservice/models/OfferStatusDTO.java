package com.codexbox.cbs_hr_management.microservice.models;

import lombok.Data;
import org.springframework.context.annotation.Configuration;


@Data
public class OfferStatusDTO {
    private int id;
    private String candidateStatus;


}
