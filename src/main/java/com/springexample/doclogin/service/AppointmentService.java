package com.springexample.doclogin.service;

import java.util.List;
import java.util.Optional;

import com.springexample.doclogin.entity.Appoinment;

public interface AppointmentService {

	public Appoinment addAppointment(Appoinment appoinment);
	public List<Appoinment> getAll_Appointment();
	public Optional<Appoinment> getspecificDetails(int id);
	public Appoinment updateAppointment(Appoinment appoinment);
	public void deleteAppointment(int id);

}
