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
    private String dayAvailability;
    private String slotStart;
    private String slotEnd;
    private Integer carsForSlot;
    private MechanicStatus mechanicStatus;
}
