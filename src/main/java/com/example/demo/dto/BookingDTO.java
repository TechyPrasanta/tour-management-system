package com.example.demo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class BookingDTO {
	private Integer id;
	private String tourpackage;
	private String bookingdate;
}
