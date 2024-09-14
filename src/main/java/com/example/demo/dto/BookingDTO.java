package com.example.demo.dto;

import java.time.LocalDateTime;

import com.example.demo.entity.Status;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
public class BookingDTO {
	private Integer userId;
    private Integer tourPackageId;
    private Status status; // Enum type
    private LocalDateTime bookingDate;
}
