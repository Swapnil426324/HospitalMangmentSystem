package com.springexample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="patients")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientID;
	private String patientName;
	private int patientAge;
	private String blood;
	private String prescription;
	private String does;
	private String fees;
	private String urgency;
	public int getPatientID() {
		return patientID;
	}
	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public String getBlood() {
		return blood;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	public String getDoes() {
		return does;
	}
	public void setDoes(String does) {
		this.does = does;
	}
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	}
	public String getUrgency() {
		return urgency;
	}
	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}
	public Patient(int patientID, String patientName, int patientAge, String blood, String prescription, String does,
			String fees, String urgency) {
		super();
		this.patientID = patientID;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.blood = blood;
		this.prescription = prescription;
		this.does = does;
		this.fees = fees;
		this.urgency = urgency;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	
}
