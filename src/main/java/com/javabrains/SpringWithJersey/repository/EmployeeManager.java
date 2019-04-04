package com.javabrains.SpringWithJersey.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javabrains.SpringWithJersey.dao.interfaces.IEmployeeDao;
import com.javabrains.SpringWithJersey.model.Employee;
import com.javabrains.SpringWithJersey.repository.interfaces.IEmployee;

@Component
public class EmployeeManager implements IEmployee {

	@Autowired
	IEmployeeDao iEmployeeDao;

	@Override
	public List<Employee> getAllEmployees() {
		return iEmployeeDao.getAllEmployees();
	}

	@Override
	public boolean saveEmployee(Employee employee) {
		return iEmployeeDao.saveEmployee(employee);
	}

	@Override
	public boolean deleteEmployeeByEmpId(String empId) {
		return iEmployeeDao.deleteEmployeeByEmpId(empId);
	}

	@Override
	public Employee findByEmpId(String empId) {
		return iEmployeeDao.findByEmpId(empId);
	}

}
