package com.unitodrive.mechanic.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SLOT_DATA")
@Data
public class SlotData {
    private String dayAvailability;
    private String slotStart;
    private String slotEnd;
    private Integer carForSlot;
    private String mechanicEmail;
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    @Id
    public String getId() {
        return id;
    }
}
