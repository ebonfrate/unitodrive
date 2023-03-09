package com.unitodrive.mechanic.controller;

import com.unitodrive.dto.MechanicRequestDto;
import com.unitodrive.mechanic.entity.GarageData;
import com.unitodrive.mechanic.entity.MechanicData;
import com.unitodrive.mechanic.entity.ServiceData;
import com.unitodrive.mechanic.entity.SlotData;
import com.unitodrive.mechanic.service.GarageProfileService;
import com.unitodrive.mechanic.service.MechanicProfileService;
import com.unitodrive.mechanic.service.ServiceProfileService;
import com.unitodrive.mechanic.service.SlotProfileService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    private MechanicProfileService mechanicProfile = null;
    private GarageProfileService garageProfile = null;
    private ServiceProfileService serviceProfile = null;
    private SlotProfileService slotProfile = null;

    @PostMapping("/create")
    public MechanicData createMechanicProfile(@RequestBody MechanicRequestDto mechanicRequestDto){
        return mechanicProfile.createMechanicProfile(mechanicRequestDto);
    }
    @PostMapping("/create")
    public GarageData createGarageProfile(@RequestBody MechanicRequestDto mechanicRequestDto){
        return garageProfile.createGarageProfile(mechanicRequestDto);
    }
    @PostMapping("/create")
    public ServiceData createServiceProfile(@RequestBody MechanicRequestDto mechanicRequestDto){
        return serviceProfile.createServiceProfile(mechanicRequestDto);
    }
    @PostMapping("/create")
    public SlotData createSlotProfile(@RequestBody MechanicRequestDto mechanicRequestDto){
        return slotProfile.createSlotProfile(mechanicRequestDto);
    }
}
