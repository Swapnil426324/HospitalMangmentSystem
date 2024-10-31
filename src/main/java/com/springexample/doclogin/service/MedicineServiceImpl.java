package com.springexample.doclogin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springexample.doclogin.entity.Medicine;
import com.springexample.doclogin.repository.MedicineRepository;

@Service
public class MedicineServiceImpl implements MedicineService{

	@Autowired
	MedicineRepository medicinerepositary;
	
	@Override
	public Medicine addMedicine(Medicine medicine) {
		// TODO Auto-generated method stub
		return this.medicinerepositary.save(medicine);
	}

	@Override
	public List<Medicine> getAll_Medicine() {
		// TODO Auto-generated method stub
		return this.medicinerepositary.findAll();
	}

	@Override
	public Optional<Medicine> getspecificDetails(int id) {
		// TODO Auto-generated method stub
		return this.medicinerepositary.findById(id);
	}

	@Override
	public Medicine updateMedicine(Medicine medicine) {
		// TODO Auto-generated method stub
		return this.medicinerepositary.save(medicine);
	}

	@Override
	public void deleteMedicine(int id) {
		Medicine medicine = this.medicinerepositary.getOne(id);
		this.medicinerepositary.delete(medicine);
		
	}

}
