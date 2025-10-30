package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entities.College;

public interface CollegeRepository extends JpaRepository<College, Integer>{
	
	

}
