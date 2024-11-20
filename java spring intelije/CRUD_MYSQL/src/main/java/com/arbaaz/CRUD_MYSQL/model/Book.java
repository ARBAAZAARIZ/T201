package com.arbaaz.CRUD_MYSQL.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;


@Entity
@Data  // to create constructor ,getter and setter automatically
@EntityListeners(AuditingEntityListener.class) //
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Size(min=5,max=10,message = "Book name must be between 5 to 10 characters")
    @NotNull(message = "please specify book name")
    @Column(nullable = false,unique = true)
    private String bookName;

    @Size(min=5,max=10,message = "Author name must be between 5 to 10 characters")
    @NotNull(message = "please specify Author name")
    @Column(nullable = false)
    private String authorName;

    @Min(value = 100,message = "min price must be 100")
    @Max(value = 200,message = "max price must be 200")
    @NotNull(message = "please specify price")
    @Column(nullable = false)
    private double price;


//
    @CreatedDate
    private Instant createdAt;

    @LastModifiedDate
    private Instant updatedAt;



}
