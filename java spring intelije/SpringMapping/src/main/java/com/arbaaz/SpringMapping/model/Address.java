package com.arbaaz.SpringMapping.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    @NotNull(message = "Please provide city name ")
    @Size(min=3, max=20 ,message = "Please enter between 3 to 20 ")
    private String city;

    @Column(nullable = false)
    @NotNull(message = "Please provide pincode")
    @Size(min=5 ,max=6, message = "Please provide correct pin must be between 5 to 6")
    private String pincode;

    @CreatedDate
    private Instant createdAt;

    @LastModifiedDate
    private Instant updatedAt;


    @OneToOne(mappedBy = "address")
    @JsonIgnore
    private Employee employee;
}
