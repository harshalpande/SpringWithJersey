package com.javabrains.SpringWithJersey.repository.interfaces;

import java.util.List;

import com.javabrains.SpringWithJersey.model.Employee;

public interface IEmployee {
	
	List<Employee> getAllEmployees();
	
	boolean saveEmployee(Employee employee);
	
	boolean deleteEmployeeByEmpId(String empId);
	
	Employee findByEmpId(String empId);
	
}
