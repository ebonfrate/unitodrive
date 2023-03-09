package com.unitodrive.mechanic.service;

import com.unitodrive.dto.MechanicRequestDto;
import com.unitodrive.mechanic.entity.SlotData;
import com.unitodrive.mechanic.repository.SlotRepository;

public class SlotProfileService {
    private SlotRepository slotRepository = null;


    public SlotData createSlotProfile(MechanicRequestDto mechanicRequestDto) {
        SlotData slot = slotRepository.save(convertDtoToEntity(mechanicRequestDto));
        mechanicRequestDto.setMechanicEmail(slot.getMechanicEmail());
        return slot;
    }
    private SlotData convertDtoToEntity(MechanicRequestDto spazio) {
        SlotData sl = new SlotData();
        sl.setMechanicEmail(spazio.getMechanicEmail());
        sl.setDayAvailability(spazio.getDayAvailability());
        sl.setSlotStart(spazio.getSlotStart());
        sl.setSlotEnd(spazio.getSlotEnd());
        sl.setCarForSlot(spazio.getCarsForSlot());
        return  sl;
    }
}
