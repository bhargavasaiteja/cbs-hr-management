package com.codexbox.employeeIdcreation.users.services;

import com.codexbox.employeeIdcreation.users.entities.BandEntity;
import com.codexbox.employeeIdcreation.users.models.BandDto;
import com.codexbox.employeeIdcreation.users.repository.BandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BandService {
    @Autowired
    BandRepo bandRepo;
    public List<BandEntity> bandDropDownService(){
        return (List<BandEntity>) bandRepo.findAll();
    }
    public void  mappingBandDropDown(BandDto bandDto, BandEntity bandEntity){
        bandDto.setId(bandEntity.getId());
        bandDto.setBandName(bandEntity.getBandName());
    }
}
