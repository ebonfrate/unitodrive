package com.unitodrive.dto;

import com.unitodrive.event.MechanicStatus;
import lombok.Data;

import java.time.format.DateTimeFormatter;
@Data
public class MechanicResponseDto {

    private String mechanicEmail;
    private String mechanicName;
    private String garageId;
    private String garageName;
    private String garageAddress;
    private String serviceName;
    private Integer bookingId;
    private String dayAvailability;
    private String slotStart;
    private String slotEnd;
    private Integer carsForSlot;
    private MechanicStatus mechanicStatus;
    private String servicePrice;


}
