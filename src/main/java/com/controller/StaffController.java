package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Staff;
import com.service.StaffService;

@RestController
@ComponentScan("com.*")
@RequestMapping("/")
public class StaffController {
	
	@Autowired
	StaffService staffService;
	
	@PutMapping
	Staff addstaff(@RequestBody Staff staff) {
		staffService.addStaff(staff);
		return staff;
	}
	@PostMapping
	Staff addstaff1(@RequestBody Staff staff) {
		staffService.addStaff(staff);
		return staff;
	}
	@GetMapping
	Staff getstaffdetails(@RequestBody Staff staff) {
		staffService.getStaff(staff);
		return staff;
	}
	@DeleteMapping
	Staff deletestaff(@RequestBody Staff staff) {
		staffService.deleteStaff(staff);
		return staff;
	}
	

}
