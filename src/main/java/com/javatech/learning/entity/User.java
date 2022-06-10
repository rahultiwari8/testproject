package com.javatech.learning.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class User {
	
	private String name;
	private String status;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String city;
	
	public User()
	{
		
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", status=" + status + ", id=" + id + ", city=" + city + "]";
	}
	public User(String name, String status, int id, String city) {
		super();
		this.name = name;
		this.status = status;
		this.id = id;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
