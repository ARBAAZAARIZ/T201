package com.example.crud_mysql.model;

import java.time.Instant;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull(message = "Please provide  city")
	@Column(nullable = false)
	private String city;

	@NotNull(message = "Please provide  pincode")
	@Column(nullable = false)
	private String pincode;
	
	@CreatedDate
	private Instant createdAt;
	
	@LastModifiedDate
	private Instant updatedAt;
	
	@OneToOne(mappedBy = "address")
	@JsonIgnore
	private Employee employee;

}
