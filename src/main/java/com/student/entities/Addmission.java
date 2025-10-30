package com.student.entities;

import java.time.LocalDate;

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
public class Addmission {
	
	@Id
	private int aId;
	
	@Column(nullable = false)
	private LocalDate dateOfAddmission;
	
	@Column(nullable = false)
	private boolean isActive;
	
	@Column(nullable = false)
	private String registrationStatus;

}
