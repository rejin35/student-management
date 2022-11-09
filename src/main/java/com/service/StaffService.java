package com.service;

import java.util.Optional;

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
	public Staff deleteStaff(Staff staff) {
		staffRepository.delete(staff);
		return staff;
	}
	public Optional<Staff> getStaffbyid(Integer staff_id) {
		Optional<Staff>getid=staffRepository.findById(staff_id);
		return getid;
	}
	public Staff updateStaff(Staff staff) {
		return staff;
	}
	

}
