package com.unitodrive.dto;

import com.unitodrive.event.MechanicStatus;

import java.time.format.DateTimeFormatter;

public class MechanicResponseDto {

    private String userMail;
    private String userName;
    private Integer garageId;
    private String garageName;
    private String garageAddress;
    private String serviceName;
    private Integer bookingId;
    private DateTimeFormatter slotStart;
    private DateTimeFormatter slotEnd;
    private MechanicStatus mechanicStatus;
}
