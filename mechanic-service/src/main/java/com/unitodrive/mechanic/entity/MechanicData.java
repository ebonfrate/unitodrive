package com.unitodrive.mechanic.entity;

import com.unitodrive.event.MechanicStatus;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name ="MECHANIC_DATA")
@Data
public class MechanicData {

    private String id;
    private String mechanicName;
    private String mechanicEmail;
    @Enumerated(EnumType.STRING)
    private MechanicStatus mechanicStatus;
    public void setId(String id) {
        this.id = id;
    }

    @Id
    public String getId() {
        return id;
    }

}
