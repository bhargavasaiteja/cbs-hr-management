package com.codexbox.cbs.hrmanagement.services;

import com.codexbox.cbs.hrmanagement.repositories.BandRepo;
import com.codexbox.cbs.hrmanagement.entities.BandEntity;
import com.codexbox.cbs.hrmanagement.models.BandDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BandService {
    @Autowired
    BandRepo bandRepo;
    public List<BandDTO> bandServiceDetails(){
        List<BandEntity> bandEntityList = (List<BandEntity>) bandRepo.findAll();
        List<BandDTO> bandDTOList = new ArrayList<>();

        bandEntityList.forEach(bandObj ->{
            BandDTO bandDTO = new BandDTO();
            mappingBandModelAndEntity(bandDTO,bandObj);
            bandDTOList.add(bandDTO);
        });
        return bandDTOList;
    }
    public void mappingBandModelAndEntity(BandDTO bandDto, BandEntity bandEntity){
        bandDto.setBandId(bandEntity.getBandId());
        bandDto.setBandName(bandEntity.getBandName());
    }
}
