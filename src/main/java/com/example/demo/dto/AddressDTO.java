package com.example.demo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class AddressDTO {
	
	private Integer id;
	private String street;
	private String city;
	private String state;
	private Integer zip;
}
