package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entities.Student;
import com.student.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService stdService;
	
	public StudentController(StudentService stdService) {
		super();
		this.stdService = stdService;
	}
	
	//find by id
	@GetMapping("students/{id}")
	public Student studentById(@PathVariable("id") int id)
	{
		return stdService.getById(id);
	}
	
	//get mapping
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getStud()
	{
		if(stdService.getStudents().size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
//		return stdService.getStudents();
		return ResponseEntity.of(Optional.of(stdService.getStudents()));
	}
	
	//post mapping
	@PostMapping("/students")
	public Student setStudent(@RequestBody Student std)
	{
		return stdService.setStudent(std);
	}
	
	//delete mapping
	@DeleteMapping("students/{id}")
	public Student deleteStudent(@PathVariable("id") int id)
	{
		return stdService.deleteById(id);
	}
	
	//put mapping
	@PutMapping("students/{id}")
	public Student upStudent(@RequestBody Student std, @PathVariable("id") int id)
	{
		return stdService.updateStudent(std,id);
	}
	
}
