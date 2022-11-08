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

import com.model.Student;
import com.service.StudentService;

@RestController
@ComponentScan("com.*")
@RequestMapping("/")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/addstudent")
	Student addstudent(@RequestBody Student student) {
		studentService.addstudent(student);
		return studentService.addstudent(student);
	}
	@GetMapping("/addstudent")
	Student addstudent1(@RequestBody Student student) {
		studentService.getstudent(student);
		return studentService.addstudent(student);
	}
	@PutMapping("/addstudent")
	Student addstudent2(@RequestBody Student student) {
		studentService.putstudent(student);
		return studentService.putstudent(student);
	}
	@DeleteMapping("/addstudent")
	Student addstudent3(@RequestBody Student student) {
		studentService.deletestudent(student);
		return studentService.deletestudent(student);
	}
	

}
