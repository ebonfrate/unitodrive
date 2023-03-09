package com.unitodrive.mechanic.entity;



import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "GARAGE_DATA")
@Data
public class GarageData {


    private String id;
    private String garageId;
    private String garageName;
    private String garageAddres;

   public void setId(String id) { this.id = id; }
    //public void getId(String garageId){this.garageId = garageId;}
    @Id
    public String getId() { return id; }
}
