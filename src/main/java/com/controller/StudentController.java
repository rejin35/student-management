package com.controller;

import java.util.List;
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
		return student;
	}
	@GetMapping("/getstudentbyid")
	    Optional<Student> getstudentbyid(@RequestParam Integer student_id) {
		Optional<Student> getid=studentService.getstudentbyid(student_id);
		return getid;
	}
	
	@PutMapping("/updatestudent")
	Student putstudent(@RequestBody Student student) {
		studentService.updatestudent(student);
		return student;
	}
	@DeleteMapping("/deletestudent")
	Student deletestudent(@RequestBody Student student) {
		studentService.deletestudent(student);
		return student;
	}



}
