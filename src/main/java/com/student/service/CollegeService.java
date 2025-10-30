package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entities.College;
import com.student.entities.Student;

@Service
public class CollegeService {
	
	@Autowired
	private StudentService stdService;
	
	public College getCollege(int id)
	{
		Student std = stdService.getById(id);
		return std.getCollege();
	}

}
