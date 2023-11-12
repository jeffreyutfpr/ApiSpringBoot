package com.apirastreamento.rastreamento.entity;


import com.apirastreamento.rastreamento.enums.StateTracker;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Tracking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String trackingNumber;

    @Column(name = "isActive" ,columnDefinition = "TINYINT(1)")
    private boolean isActive;


    @Column(name = "created_at")
    @CreatedDate
    private LocalDateTime createdAt ;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PreUpdate
    public void preUpdate(){
        updatedAt = LocalDateTime.now();
    }

   /* @Enumerated(EnumType.STRING)
    @Column(name = "state", nullable = false)
    private StateTracker state;
    */


  //  private ArrayList<Event> listEvents;

}
