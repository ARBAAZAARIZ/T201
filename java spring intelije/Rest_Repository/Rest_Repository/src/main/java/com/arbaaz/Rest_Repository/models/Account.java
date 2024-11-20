package com.arbaaz.Rest_Repository.models;

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
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Size(min = 3,max = 20,message = "Please enter bank name under 3 to 20 characters")
    @NotNull(message = "please provide bank name")
    @Column(nullable = false)
    private String bankName;

    @Size(min = 3,max = 20,message = "Please enter account number under 5 to 20 characters")
    @NotNull(message = "please provide account number")
    @Column(nullable = false,unique = true)
    private String accountNumber;

    @CreatedDate
    private Instant createdAt;

    @LastModifiedDate
    private Instant updatedAt;

    @ManyToOne
    @JoinColumn(name="employee_id")
    @JsonIgnore
    private Employee employee;
}
