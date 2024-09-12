package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.Address;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepository;

	//@Autowired
	//private PasswordEncoder passwordEncoder; // Injecting the PasswordEncoder

	public User registerUser(UserDTO userDTO) {
		// Check if user already exists
		if (userRepository.findByEmail(userDTO.getEmail()) != null) {
			throw new RuntimeException("User already exists with email: " + userDTO.getEmail());
		}

		// Convert DTO to Entity
		User user = new User();
		user.setName(userDTO.getName());
		user.setEmail(userDTO.getEmail());
		// Encrypt the password before saving it
		// String encryptedPassword = passwordEncoder.encode(userDTO.getPassword());
		// user.setPassword(encryptedPassword); // Save the encrypted password
		user.setPassword(userDTO.getPassword());
		user.setRole(userDTO.getRole()); // Set the role from DTO

		Address address = new Address();
		address.setStreet(userDTO.getAddress().getStreet());
		address.setCity(userDTO.getAddress().getCity());
		address.setState(userDTO.getAddress().getState());
		address.setZip(userDTO.getAddress().getZip());

		user.setAddress(address);

		// Save user entity (address will be saved due to CascadeType.ALL)
		return userRepository.save(user);
	}
}
