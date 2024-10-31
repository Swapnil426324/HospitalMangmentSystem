package com.springexample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springexample.dao.PatientRepository;
import com.springexample.model.Patient;

@Service
public class PatientServiceImplementation implements PatientService{

	@Autowired
	PatientRepository prepository;
	
	@Override
	public Patient addPatient(Patient p) {
		
		return this.prepository.save(p);
	}

	@Override
	public List<Patient> getAllPatientDetails() {
		
		return this.prepository.findAll();
	}

	@Override
	public Optional<Patient> getspecificDetails(int id) {
		
		return this.prepository.findById(id);
	}

	@Override
	public Patient updateDetails(Patient p) {
		
		return this.prepository.save(p);
	}

	@Override
	public void deletePatient(int id) {
		Patient pID = this.prepository.getOne(id);
		 this.prepository.delete(pID);
		
	}

	
}
