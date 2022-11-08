package com.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;

@RestController
@RequestMapping("com.*")
public class StudentController {
	
	@PostMapping("/addstudent")
	Student addstudent(@RequestBody Student student) {
		return student;
	}
	@GetMapping("/addstudent")
	Student addstudent1(@RequestBody Student student) {
		return student;
	}
	@PutMapping("/addstudent")
	Student addstudent2(@RequestBody Student student) {
		return student;
	}
	@DeleteMapping("/addstudent")
	Student addstudent3(@RequestBody Student student) {
		return student;
	}
	

}
