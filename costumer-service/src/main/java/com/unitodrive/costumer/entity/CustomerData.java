package com.unitodrive.costumer.entity;

import com.unitodrive.event.BookingStatus;
import com.unitodrive.event.MechanicStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER_DATA_TBL")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CustomerData {

    @Id
    private String userMail;
    private String userName;
    private Integer bookingId;

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;
    @Enumerated(EnumType.STRING)
    private MechanicStatus mechanicStatus;

    public void setId(String userMail) { this.userMail = userMail; }
    public String getId() { return userMail; }

}


