package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Staff;
import com.repository.StaffRepository;

@Service
public class StaffService {
	
	@Autowired
	StaffRepository staffRepository;
	
	public Staff addStaff(Staff staff) {
		staffRepository.save(staff);
		return staff;
	}
	public Staff putStaff(Staff staff) {
		staffRepository.save(staff);
		return staff;
	}
	public Staff deleteStaff(Staff staff) {
		staffRepository.delete(staff);
		return staff;
	}
	public Staff getStaff(Staff staff) {
		return staff;
	}
	

}
