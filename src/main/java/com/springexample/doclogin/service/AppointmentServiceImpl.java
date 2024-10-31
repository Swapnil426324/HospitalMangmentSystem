package com.springexample.doclogin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springexample.doclogin.entity.Appoinment;
import com.springexample.doclogin.repository.AppoinementRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService{

	@Autowired
	AppoinementRepository appointmentrepository;

	@Override
	public Appoinment addAppointment(Appoinment appoinment) {
		// TODO Auto-generated method stub
		return this.appointmentrepository.save(appoinment);
	}

	@Override
	public List<Appoinment> getAll_Appointment() {
		// TODO Auto-generated method stub
		return this.appointmentrepository.findAll();
	}

	@Override
	public Optional<Appoinment> getspecificDetails(int id) {
		// TODO Auto-generated method stub
		return this.appointmentrepository.findById(id);
	}

	@Override
	public Appoinment updateAppointment(Appoinment appoinment) {
		// TODO Auto-generated method stub
		return this.appointmentrepository.save(appoinment);
	}

	@Override
	public void deleteAppointment(int id) {
		// TODO Auto-generated method stub
		Appoinment appointment = this.appointmentrepository.getOne(id);
		 this.appointmentrepository.delete(appointment);
		
	}
	
}
