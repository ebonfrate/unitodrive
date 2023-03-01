package com.unitodrive.event;

import com.unitodrive.dto.CustomerRequestDto;

import java.util.Date;
import java.util.UUID;

public class CustomerEvent implements  Event {
    private UUID eventId=UUID.randomUUID();
    private Date eventDate=new Date();

    private CustomerRequestDto customerRequestDto;

    @Override
    public UUID getEventId() { return eventId; }

    @Override
    public Date getDate() { return eventDate; }

    public CustomerEvent(CustomerRequestDto customerRequestDto) {
        this.customerRequestDto = customerRequestDto;
    }
}
