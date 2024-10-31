package com.springexample.doclogin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="appoinments")
public class Appoinment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String age;
	private  String aymtomps;
	private String number;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAymtomps() {
		return aymtomps;
	}
	public void setAymtomps(String aymtomps) {
		this.aymtomps = aymtomps;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Appoinment(int id, String name, String age, String aymtomps, String number) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.aymtomps = aymtomps;
		this.number = number;
	}
	public Appoinment() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	
}
