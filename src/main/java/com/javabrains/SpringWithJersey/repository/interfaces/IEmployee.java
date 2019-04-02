package com.javabrains.SpringWithJersey.repository.interfaces;

import java.util.List;

import com.javabrains.SpringWithJersey.model.Employee;

public interface IEmployee {
	
	List<Employee> getAllEmployees();
	
	boolean saveEmployee(Employee employee);
	
	boolean deleteEmployee(String empId);
	
}
