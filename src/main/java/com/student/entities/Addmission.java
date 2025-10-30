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

//	public Addmission() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Addmission(int aId, LocalDate dateOfAddmission, boolean isActive, String registrationStatus) {
//		super();
//		this.aId = aId;
//		this.dateOfAddmission = dateOfAddmission;
//		this.isActive = isActive;
//		this.registrationStatus = registrationStatus;
//	}
//
//	public int getaId() {
//		return aId;
//	}
//
//	public void setaId(int aId) {
//		this.aId = aId;
//	}
//
//	public LocalDate getDateOfAddmission() {
//		return dateOfAddmission;
//	}
//
//	public void setDateOfAddmission(LocalDate dateOfAddmission) {
//		this.dateOfAddmission = dateOfAddmission;
//	}
//
//	public boolean isActive() {
//		return isActive;
//	}
//
//	public void setActive(boolean isActive) {
//		this.isActive = isActive;
//	}
//
//	public String getRegistrationStatus() {
//		return registrationStatus;
//	}
//
//	public void setRegistrationStatus(String registrationStatus) {
//		this.registrationStatus = registrationStatus;
//	}
//
//	@Override
//	public String toString() {
//		return "Addmission [aId=" + aId + ", dateOfAddmission=" + dateOfAddmission + ", isActive=" + isActive
//				+ ", registrationStatus=" + registrationStatus + "]";
//	}

}
