package com.unitodrive.mechanic.service;

import com.unitodrive.dto.MechanicRequestDto;
import com.unitodrive.mechanic.entity.MechanicData;
import com.unitodrive.mechanic.repository.MechanicRepository;

public class MechanicProfileService {

    private MechanicRepository mechanicRepository = null;


        public MechanicData createMechanicProfile(MechanicRequestDto mechanicRequestDto) {
            MechanicData mechanic = mechanicRepository.save(convertDtoToEntity(mechanicRequestDto));
            mechanicRequestDto.setMechanicEmail(mechanic.getMechanicEmail());
            return mechanic;
        }
        private MechanicData convertDtoToEntity(MechanicRequestDto meccanico) {
            MechanicData meca = new MechanicData();
            meca.setMechanicEmail(meccanico.getMechanicEmail());
            meca.setMechanicName(meccanico.getMechanicName());

            return  meca;
        }
    }

