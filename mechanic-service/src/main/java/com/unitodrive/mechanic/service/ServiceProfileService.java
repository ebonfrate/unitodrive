package com.unitodrive.mechanic.service;

import com.unitodrive.dto.MechanicRequestDto;
import com.unitodrive.mechanic.entity.ServiceData;
import com.unitodrive.mechanic.repository.ServiceRepository;

public class ServiceProfileService {

    private ServiceRepository serviceRepository = null;


    public ServiceData createServiceProfile(MechanicRequestDto mechanicRequestDto) {
        ServiceData service = serviceRepository.save(convertDtoToEntity(mechanicRequestDto));
        mechanicRequestDto.setGarageId(service.getGarageId());
        return service;
    }
    private ServiceData convertDtoToEntity(MechanicRequestDto servizio) {
        ServiceData servi = new ServiceData();
        servi.setMechanicEmail(servizio.getMechanicEmail());
        servi.setGarageId(servizio.getGarageId());
        servi.setGarageName(servizio.getGarageName());
        servi.setServiceName(servizio.getServiceName());
        servi.setServicePrice(servizio.getServicePrice());
        return  servi;
    }
}
