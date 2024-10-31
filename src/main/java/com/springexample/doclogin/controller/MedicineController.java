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

import com.springexample.doclogin.entity.Medicine;
import com.springexample.doclogin.repository.MedicineRepository;
import com.springexample.doclogin.service.MedicineService;
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/v3")
public class MedicineController {

	@Autowired
	MedicineService service;
	
	@PostMapping("/medicine")
	public Medicine createMedicine(@RequestBody Medicine medicine) {
		return this.service.addMedicine(medicine);
	}
	
	@GetMapping("/medicine")
	public List<Medicine> getAllMedicine(){
		return this.service.getAll_Medicine();
	}
	
	@GetMapping("medicine/{id}")
	public Optional<Medicine> getById(@PathVariable("id") int id){
		return this.service.getspecificDetails(id);
	}
	
	@PutMapping("/medicine")
	public Medicine updateMedicine(@RequestBody Medicine medicine) {
		return this.service.updateMedicine(medicine);
	}
	
	@DeleteMapping("/medicine/{id}")
	public void delete(@PathVariable("id") int id) {
		 this.service.deleteMedicine(id);
	}

}
