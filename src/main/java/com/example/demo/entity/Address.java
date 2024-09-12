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
@Table(name = "address", schema = "tour-management-system")
public class Address {
	
   @Id	
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   
private Integer id;
private String street;
private String city;
private String state;
private Integer zip;
}
