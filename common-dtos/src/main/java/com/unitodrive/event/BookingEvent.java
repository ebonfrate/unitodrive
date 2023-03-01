package com.unitodrive.event;

import com.unitodrive.dto.BookingRequestDto;

import java.util.Date;
import java.util.UUID;

public class BookingEvent implements Event{

    private UUID eventId=UUID.randomUUID();
    private Date eventDate=new Date();
    private BookingRequestDto bookingRequestDto;
    private BookingStatus bookingStatus;

    @Override
    public UUID getEventId() { return eventId; }

    @Override
    public Date getDate() { return eventDate; }

    public BookingEvent(BookingRequestDto bookingRequestDto, BookingStatus bookingStatus) {
        this.bookingRequestDto = bookingRequestDto;
        this.bookingStatus = bookingStatus;
    }
}
