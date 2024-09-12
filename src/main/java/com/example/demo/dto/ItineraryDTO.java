package com.example.demo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ItineraryDTO {
	private Integer id;
	private Integer day;
	private String description;

}
