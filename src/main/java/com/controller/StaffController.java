package com.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Staff;

@RestController
@ComponentScan("com.*")
public class StaffController {
	
	
	
	@PutMapping
	Staff addstaff(@RequestBody Staff staff) {
		return staff;
	}
	@PostMapping
	Staff addstaff1(@RequestBody Staff staff) {
		return staff;
	}
	@GetMapping
	Staff addstaff2(@RequestBody Staff staff) {
		return staff;
	}
	@DeleteMapping
	Staff addstaff3(@RequestBody Staff staff) {
		return staff;
	}
	

}
