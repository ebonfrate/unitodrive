package com.unitodrive.costumer.entity;

import com.unitodrive.event.BookingStatus;
import com.unitodrive.event.MechanicStatus;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CUSTOMER_DATA_TBL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerData {
//ti odio
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "UserMail")
    private String userMail;
    @Column(name = "UserName")
    private String userName;
    @Column(name = "BookingId")
    private Integer bookingId;

    @Column(name = "BookingStatus")
    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;
    @Column(name = "MechanicStatus")
    @Enumerated(EnumType.STRING)
    private MechanicStatus mechanicStatus;

    public void setId(String userMail) { this.userMail = userMail; }
    public String getId() { return userMail; }

}


