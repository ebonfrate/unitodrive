package com.unitodrive.event;

import com.unitodrive.dto.MechanicRequestDto;

import java.util.Date;
import java.util.UUID;

public class MechanicEvent implements  Event {

    private UUID eventId=UUID.randomUUID();
    private Date eventDate=new Date();

    private MechanicRequestDto mechanicRequestDto;
    private MechanicStatus mechanicStatus;

    @Override
    public UUID getEventId() { return eventId; }

    @Override
    public Date getDate() { return eventDate; }

    public MechanicEvent(MechanicRequestDto mechanicRequestDto, MechanicStatus mechanicStatus) {
        this.mechanicRequestDto = mechanicRequestDto;
        this.mechanicStatus = mechanicStatus;
    }
}
