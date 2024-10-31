package com.springexample.doclogin.controller;

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

import com.springexample.doclogin.entity.Appoinment;
import com.springexample.doclogin.service.AppointmentService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/v2")
public class AppoinmentController {

	@Autowired
	AppointmentService service;

	@PostMapping("/insert")
	public Appoinment createAppoinment(@RequestBody Appoinment appoinment) {
		return this.service.addAppointment(appoinment);
	}

	@GetMapping("/insert")
	public List<Appoinment> getAllAppoinement() {
		return this.service.getAll_Appointment();
	}
	
	@GetMapping("/insert/{id}")
	public Optional<Appoinment> getAppointmentById(@PathVariable("id") int id){
		return this.service.getspecificDetails(id);
		
	}
	
	@PutMapping("/insert")
	public Appoinment updateAppointment(@RequestBody Appoinment appointment) {
		return this.service.updateAppointment(appointment);
	}
	
	@DeleteMapping("/insert/{id}")
	public void deleteAppointment(@PathVariable("id") int id) {
		 this.service.deleteAppointment(id);
	}

}
