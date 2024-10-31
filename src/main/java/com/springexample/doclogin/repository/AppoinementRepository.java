package com.springexample.doclogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springexample.doclogin.entity.Appoinment;

@Repository
public interface AppoinementRepository extends JpaRepository<Appoinment, Integer>{

}
