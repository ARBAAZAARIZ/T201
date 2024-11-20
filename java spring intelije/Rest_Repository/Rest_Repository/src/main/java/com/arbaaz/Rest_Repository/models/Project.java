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
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Data
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Size(min = 5,max = 20,message = "Project name must be between 5 to 20 characters")
    @NotNull(message = "Please provide project name")
    @Column(nullable = false)
    private String projectName;

    @CreatedDate
    private Instant createdAt;

    @LastModifiedDate
    private Instant updatedAt;

    @ManyToMany(mappedBy = "projects")
    @JsonIgnore
    private List<Employee> employees;

}
