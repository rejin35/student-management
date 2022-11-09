package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Staff;
import com.service.StaffService;

@RestController
@ComponentScan("com.*")
@RequestMapping("/")
public class StaffController {
	
	@Autowired
	StaffService staffService;
	
	@PutMapping("/updatestaff")
	Staff addstaff(@RequestBody Staff staff) {
		staffService.updateStaff(staff);
		return staff;
	}
	@PostMapping("/addstaff")
	Staff addstaff1(@RequestBody Staff staff) {
		staffService.addStaff(staff);
		return staff;
	}
	@GetMapping("/getstaffbyid")
		Optional<Staff> getstaffbyid(@RequestParam Integer staff_id) {
		Optional<Staff> getid=staffService.getStaffbyid(staff_id);
		return getid;
	}
	@DeleteMapping("/deletestaff")
	Staff deletestaff(@RequestBody Staff staff) {
		staffService.deleteStaff(staff);
		return staff;
	}
	

}
