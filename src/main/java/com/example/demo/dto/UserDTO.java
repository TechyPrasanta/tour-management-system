package com.example.demo.dto;

import com.example.demo.entity.Role;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class UserDTO {
	private Integer id;
	private String name;
	private String email;
	private String password;
	private Role role; // Use the Role enum
	private AddressDTO address;

}
