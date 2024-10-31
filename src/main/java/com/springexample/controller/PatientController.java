package com.springexample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springexample.model.Patient;
import com.springexample.service.PatientService;
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/v1")
public class PatientController {

	@Autowired
	private PatientService service;
	
	@PostMapping("/patient")
	public Patient addNewPatient(@RequestBody Patient patient) {
		return this.service.addPatient(patient);
		
	} 
	
	@GetMapping("/patient")
	public List<Patient> getAllPatientDetails() {
		return this.service.getAllPatientDetails();
		
	}
	
	@GetMapping("/patient/{id}")
	public Optional<Patient> specificPatient(@PathVariable int id) {
		return this.service.getspecificDetails(id);
		
	}
	
	@PutMapping("/patient")
	public Patient updateDetails(@RequestBody Patient p){
		return this.service.updateDetails(p);
		
	}
	
	@DeleteMapping("/patient/{id}")
	public void deletePatient(@PathVariable int id) {
		 this.service.deletePatient(id);
		
	}
	
	
	
	
	
	
}
