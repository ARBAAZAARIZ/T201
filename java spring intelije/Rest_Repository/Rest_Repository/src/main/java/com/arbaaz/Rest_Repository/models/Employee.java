package com.arbaaz.Rest_Repository.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;
import java.util.List;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull(message = "Please provide  name")
    @Column(nullable = false)
    private String name;

    @NotNull(message = "please provide salary")
    @Column(nullable = false)
    private double salary;

    @NotNull(message = "please provide phone")
    @Column(nullable = false)
    @Pattern(regexp="^[0-9]{10}$", message="please correct phone number")
    private String phone;

    @CreatedDate
    private Instant createAt;

    @LastModifiedDate
    private Instant updatedAt;

    @OneToOne
    @JoinColumn(name="address_id")
    private Address address;

    @OneToMany(mappedBy = "employee")
    private List<Account>accounts;

    @ManyToMany
    @JoinTable(
            name = "employee_project",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    private List<Project> projects;
}
