package com.springexample.service;

import java.util.List;
import java.util.Optional;

import com.springexample.model.Patient;


public interface PatientService {

	public Patient addPatient(Patient p);
	public List<Patient> getAllPatientDetails();
	public Optional<Patient> getspecificDetails(int id);
	public Patient updateDetails(Patient p);
	public void deletePatient(int id);
}
