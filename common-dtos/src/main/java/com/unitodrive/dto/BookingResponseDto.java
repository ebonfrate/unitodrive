package com.unitodrive.dto;

import com.unitodrive.event.BookingStatus;

import java.util.Date;

public class BookingResponseDto {

    private Integer costumerMail;
    private Integer bookingId;
    private Date bookingDate;
    private Integer garageId;
    private Integer serviceId;
    private BookingStatus bookingStatus;
}
