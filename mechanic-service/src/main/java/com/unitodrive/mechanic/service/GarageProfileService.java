package com.unitodrive.mechanic.service;

import com.unitodrive.dto.MechanicRequestDto;
import com.unitodrive.mechanic.entity.GarageData;
import com.unitodrive.mechanic.repository.GarageRepository;

import javax.transaction.Transactional;

public class GarageProfileService {

    private GarageRepository garageRepository = null;

    @Transactional
    public GarageData createGarageProfile(MechanicRequestDto mechanicRequestDto) {
        GarageData garage = garageRepository.save(convertDtoToEntity(mechanicRequestDto));
        mechanicRequestDto.setGarageId(garage.getGarageId());
        return garage;
    }

    private GarageData convertDtoToEntity(MechanicRequestDto office) {
        GarageData gara = new GarageData();
        gara.setGarageId(office.getGarageId());
        gara.setGarageName(office.getGarageName());
        gara.setGarageAddres(office.getGarageAddress());
        return  gara;
    }
}

