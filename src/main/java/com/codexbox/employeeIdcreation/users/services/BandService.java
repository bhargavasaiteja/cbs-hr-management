package com.codexbox.employeeIdcreation.users.services;

import com.codexbox.employeeIdcreation.users.entities.BandEntity;
import com.codexbox.employeeIdcreation.users.models.BandDTO;
import com.codexbox.employeeIdcreation.users.repository.BandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BandService {
    @Autowired
    BandRepo bandRepo;
    public List<BandDTO> bandDropDownService(){
        List<BandEntity> bandEntityList = (List<BandEntity>) bandRepo.findAll();
        List<BandDTO> bandDTOList = new ArrayList<>();
        bandEntityList.forEach(bandObj ->{
            BandDTO bandDTO = new BandDTO();
            mappingBandDropDown(bandDTO,bandObj);
            bandDTOList.add(bandDTO);
        });
        return bandDTOList;
    }
    public void  mappingBandDropDown(BandDTO bandDto, BandEntity bandEntity){
        bandDto.setBandId(bandEntity.getBandId());
        bandDto.setBandName(bandEntity.getBandName());
    }
}
