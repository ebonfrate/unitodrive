package com.unitodrive.event;

import java.util.Date;
import java.util.UUID;

public class MechanicEvent implements  Event {

    private UUID eventId=UUID.randomUUID();
    private Date eventDate=new Date();


    @Override
    public UUID getEventId() { return eventId; }

    @Override
    public Date getDate() { return eventDate; }
}
