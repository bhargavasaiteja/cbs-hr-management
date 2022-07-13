package com.codexbox.cbs_onboarding_formalities.services;

import com.codexbox.cbs_onboarding_formalities.entities.OfferStatusEntity;
import com.codexbox.cbs_onboarding_formalities.models.OfferStatusDTO;
import com.codexbox.cbs_onboarding_formalities.repositories.OfferStatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
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
