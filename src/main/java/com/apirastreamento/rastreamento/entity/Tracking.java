package com.apirastreamento.rastreamento.entity;


import com.apirastreamento.rastreamento.enums.StateTracker;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Tracking {

    @Id
    private String trackingNumber;

    


   /* @Enumerated(EnumType.STRING)
    @Column(name = "state", nullable = false)
    private StateTracker state;
    */

}
