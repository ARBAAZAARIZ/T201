package com.arbaaz.SpringMapping.model;



import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Size(min=3,max=10,message = "name must be between 3 and 20")
    @NotNull(message = "Please provide name")
    private String name;

    @Column(unique = false,nullable = false)
    @NotNull(message = "Prlease provide salary")
    private double salary;

    @Pattern(regexp = "^[0-9]{10}$",message = "please enter correct phone number")
    @NotNull(message = "please provide phone")
    @Column(unique = true,nullable = false)
    private long phone;

    @CreatedDate
    private Instant createdAt;

    @LastModifiedDate
    private Instant updatedAt;



    @OneToOne
    @JoinColumn(name="address_id")
    private Address address;

}
