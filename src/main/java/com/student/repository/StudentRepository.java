package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	public Student findByEmail(String email);
	public Student deleteById(int id);
}
