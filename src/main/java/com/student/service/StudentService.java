package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entities.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository stdRepo;
	
	//get students
	public List<Student> getStudents()
	{
		System.out.println();
		return stdRepo.findAll();
	}
	
	//find by id
	public Student getById(int id)
	{
		return stdRepo.findById(id).get();
	}
	
	//insert student
	public Student setStudent(Student std)
	{
		System.out.println();
		return stdRepo.save(std);
	}
	
	//get by email
	public Student getByEmail(String email)
	{
		System.out.println();
		return stdRepo.findByEmail(email);
	}
	
	//delete student
	public Student deleteById(int id)
	{
		System.out.println();
		return stdRepo.deleteById(id);
	}

	//update student
	public Student updateStudent(Student std, int id)
	{
		 Student student = stdRepo.findById(id).get();
		 student.setAddress(std.getAddress());
		 student.setAdmission(std.getAdmission());
		 student.setAge(std.getAge());
		 student.setCollege(std.getCollege());
		 student.setEmail(std.getEmail());
		 student.setGender(std.getGender());
		 student.setId(std.getId());
		 student.setName(std.getName());
		 student.setParent(std.getParent());
		 student.setPhoneNumber(std.getPhoneNumber());
		 System.out.println();
		 return stdRepo.save(student); 
	}
}
