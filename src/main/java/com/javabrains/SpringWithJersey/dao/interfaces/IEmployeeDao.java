package com.javabrains.SpringWithJersey.dao.interfaces;

import java.util.List;

import com.javabrains.SpringWithJersey.model.Employee;

public interface IEmployeeDao {
	
	List<Employee> getAllEmployees();
	
	boolean saveEmployee(Employee employee);
	
	boolean deleteEmployee(String empId);

}
