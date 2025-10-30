package com.student;

import com.student.entities.Addmission;
import com.student.entities.Address;
import com.student.entities.College;
import com.student.entities.Parent;
import com.student.entities.Student;
import com.student.service.StudentService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StudentManagementSystemApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(StudentManagementSystemApplication.class, args);
		StudentService stdServe = ac.getBean(StudentService.class);
		
		Student std = new Student();
		std.setId(101);
		std.setName("Abhishek");
		std.setAge(24);
		std.setEmail("ap7218362896@gmail.com");
		std.setPhoneNumber(7218362896l);
		std.setGender("Male");
		
		Parent p1 = new Parent();
		p1.setPId(1);
		p1.setGuardianEmail("ap07218362896@gmail.com");
		p1.setGuardianName("Manohar Pawar");
		p1.setGuardianPhoneNumber(9075018870l);
		std.setParent(p1);
		
		Address add = new Address();
		add.setPincode(411057);
		add.setCity("pune");
		add.setState("Maharashtra");
		std.setAddress(add);
		
		Addmission admission = new Addmission();
		admission.setActive(true);
		admission.setAId(123);
		admission.setRegistrationStatus("registered");
		
		College college = new College();
		college.setDept("CS");
		college.setRollNumber(10001);
		college.setYearOfStudy(3);
		college.setCourse("Bachelor Of Computer Science");
		college.setCgpa(8.67);
		college.setBatch("M17");
		college.setAddmission(admission);
		
		List<String> subjects = new ArrayList<>();
		subjects.add("Data Science and Big Data Analytics");
		subjects.add("Web Technology");
		subjects.add("Artificial Intelligence");
		subjects.add("Cloud Computing");
		college.setSubject(subjects);
		std.setCollege(college);
		
		LocalDate date = LocalDate.of(2022, 6, 14);
		admission.setDateOfAddmission(date);
		std.setAdmission(admission);
		
//		Student student = stdServe.setStudent(std);
		System.out.println();
		List<Student> list = stdServe.getStudents();
		System.out.println();
		list.forEach(e -> System.out.println(e));
		
	}

}
