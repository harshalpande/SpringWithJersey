package com.javabrains.SpringWithJersey.model;

import java.util.Date;

public class Employee {
	
	private int id;
	
	private String empid;
	
	private String name;

	private Date dateOfJoining;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String empid, String name, Date dateOfJoining) {
		super();
		this.id = id;
		this.empid = empid;
		this.name = name;
		this.dateOfJoining = dateOfJoining;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
}
