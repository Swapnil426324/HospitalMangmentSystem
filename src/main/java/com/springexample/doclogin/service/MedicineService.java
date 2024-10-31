package com.springexample.doclogin.service;

import java.util.List;
import java.util.Optional;

import com.springexample.doclogin.entity.Medicine;

public interface MedicineService {

	public Medicine addMedicine(Medicine medicine);
	public List<Medicine> getAll_Medicine();
	public Optional<Medicine> getspecificDetails(int id);
	public Medicine updateMedicine(Medicine medicine);
	public void deleteMedicine(int id);

}
