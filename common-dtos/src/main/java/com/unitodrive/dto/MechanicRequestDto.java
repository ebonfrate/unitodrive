package com.unitodrive.dto;

import lombok.Data;

@Data
public class MechanicRequestDto {

    private String mechanicEmail;
    private String mechanicName;
    private String garageId;
    private String garageName;
    private String garageAddress;
    private String serviceName;
    private String servicePrice;
    private Integer bookingId;
    private String dayAvailability;
    private String slotStart;
    private String slotEnd;
    private Integer carsForSlot;

}
