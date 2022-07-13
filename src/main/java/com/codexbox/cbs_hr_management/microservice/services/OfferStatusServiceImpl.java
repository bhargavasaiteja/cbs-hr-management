package com.codexbox.cbs_hr_management.microservice.services;

import com.codexbox.cbs_hr_management.microservice.repositories.OfferStatusRepo;
import com.codexbox.cbs_hr_management.microservice.entities.OfferStatusEntity;
import com.codexbox.cbs_hr_management.microservice.models.OfferStatusDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OfferStatusServiceImpl {
    @Autowired
    public OfferStatusRepo offerStatusRepo;
    public List<OfferStatusDTO> getDetails() {
        List<OfferStatusDTO>  list = new ArrayList();
        List<OfferStatusEntity>offerstatusentity = (List<OfferStatusEntity>) offerStatusRepo.findAll();
        offerstatusentity.forEach(entity->
        {
            OfferStatusDTO offerStatusDTO = new OfferStatusDTO();
            mapModelToEntity(offerStatusDTO, entity);

            list.add(offerStatusDTO);

        });
        return list;
    }
    private void mapModelToEntity(OfferStatusDTO offerStatusDTO, OfferStatusEntity entity) {
        offerStatusDTO.setId(entity.getId());
       offerStatusDTO.setCandidateStatus(entity.getCandidatestatus());
    }

}
