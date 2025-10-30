package com.student.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
	
	@Id
	private int id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private int age;
	private String gender;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = false)
	private long phoneNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private Parent parent;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private College college;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JsonManagedReference
	private Address address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private Addmission admission;
}
