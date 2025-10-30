package com.student.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.student.entities.College;
import com.student.service.CollegeService;


@RestController
public class CollegeController {
	
	@Autowired
	private CollegeService clgService;
	
	@GetMapping("/college/{id}")
	public ResponseEntity<College> getCollegeById(@PathVariable("id") int id)
	{
		return ResponseEntity.of(Optional.of(clgService.getCollege(id)));
	}
}
