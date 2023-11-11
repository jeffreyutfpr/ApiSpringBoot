package com.apirastreamento.rastreamento.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "cpf", nullable = false, unique = true)
    private String CPF;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "user_email", nullable = false , unique = true)
    private String userEmail;

    @Column(name = "phone_number", nullable = false )
    private String phoneNumber;

    @Column(name = "password" , nullable = false)
    private String password;

    @Column(name = "birth_date" , nullable = false)
    private LocalDate birthDate;

    @Column(name = "created_at")
    @CreatedDate
    private LocalDateTime createdAt ;

    @Column(name = "isActive" ,columnDefinition = "TINYINT(1)" )
    private boolean isActive;

}
