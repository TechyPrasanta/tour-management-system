package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
private String tourpackage;
private String bookingdate;
}
