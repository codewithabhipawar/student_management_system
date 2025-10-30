package com.student.entities;

import org.springframework.context.annotation.Lazy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Lazy
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Parent {
	
	@Id
	private int pId;
	@Column(nullable = false)
	private String guardianName;
	
	@Column(nullable = false)
	private long guardianPhoneNumber;
	
	@Column(nullable = false)
	private String guardianEmail;
}
