package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data
@Table(name = "booking", schema = "tour-management-system")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tour_package_id", nullable = false)
	private Tourpackage tourPackage;

	@Enumerated(EnumType.STRING) // Store enum as a string in the database
	private Status status;

	private LocalDateTime bookingDate;

}
