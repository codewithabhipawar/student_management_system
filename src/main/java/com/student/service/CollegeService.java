package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entities.College;
import com.student.entities.Student;
import com.student.repository.CollegeRepository;

@Service
public class CollegeService {
	
	@Autowired
	private CollegeRepository clgRepo;
	
	@Autowired
	private StudentService stdService;

	public CollegeService(CollegeRepository clgRepo) {
		super();
		this.clgRepo = clgRepo;
	}
	
	public College getCollege(int id)
	{
		Student std = stdService.getById(id);
		return std.getCollege();
	}

}
