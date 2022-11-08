package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student;
import com.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public Student addstudent(Student student) {
		studentRepository.save(student);
		return student;
		
	}
	
	public Student putstudent(Student student) {
		studentRepository.save(student);
		return student;
		
	}
	public Student getstudent(Student student) {

		return student;
		
	}
	public Student deletestudent(Student student) {
		studentRepository.delete(student);
		return student;
		
	}
}
