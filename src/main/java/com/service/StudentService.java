package com.service;
import java.util.Optional;

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
	
	public Student updatestudent(Student student) {
		studentRepository.save(student);
		return student;
		
	}
	public Student deletestudent(Student student) {
		studentRepository.delete(student);
		return student;
		
	}
	public Optional<Student> getstudentbyid(Integer student_id){
		Optional<Student>getid=studentRepository.findById(student_id);
		return getid;
	}
}
