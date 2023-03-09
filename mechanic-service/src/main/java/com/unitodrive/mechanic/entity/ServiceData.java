package com.unitodrive.mechanic.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SERVICE_DATA")
@Data
public class ServiceData {
    private String mechanicEmail;
    private String garageName;
    private String garageId;
    private String serviceName;
    private String servicePrice;
    private String id;


    public void setId(String id) {
        this.id = id;
    }

    @Id
    public String getId() {
        return id;
    }
}
