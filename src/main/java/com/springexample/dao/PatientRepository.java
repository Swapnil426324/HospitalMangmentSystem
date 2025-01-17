package com.springexample.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springexample.model.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
