package com.arbaaz.SpringMappingDemo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Size(min = 3,max=20,message = "provide name between 3 to 10 character ")
    @Column(nullable = false)
    @NotNull(message = "name cannot be null")
    private String name;

//@NotNull(message = "please provide phone")
//	@Column(nullable = false)
//	@Pattern(regexp="^[0-9]{10}$", message="please correct phone number")

    @Pattern(regexp = "^[0-9]{10}$",message = "phone must be of 10 digits")
    @Column(nullable = false,unique = true)
    @NotNull(message = "Phone number is required")
    private String phone;

    @CreatedDate
    private Instant createdAt;
    @LastModifiedDate
    private Instant updatedAt;
}
