package com.student.entities;

import java.util.List;

import org.springframework.context.annotation.Lazy;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "college")
@Lazy
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class College {
	
	@Id
	private int rollNumber;
	
	@Column(nullable = false)
	private String course;
	
	@Column(nullable = false)
	private String dept;
	
	@Column(nullable = false)
	private int yearOfStudy;
	
	@Column(nullable = false)
	private double cgpa;
	
	@Column(nullable = false)
	private List<String> subject;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonBackReference
	private Student std;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Addmission addmission;
	
	private String batch;

}
