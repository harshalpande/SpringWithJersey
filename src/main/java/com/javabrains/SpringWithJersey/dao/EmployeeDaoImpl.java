package com.javabrains.SpringWithJersey.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.javabrains.SpringWithJersey.dao.interfaces.IEmployeeDao;
import com.javabrains.SpringWithJersey.model.Employee;

@Component
public class EmployeeDaoImpl implements IEmployeeDao {

	@Autowired
	public HibernateTemplate hibernateTemplate;

	@Override
	public List<Employee> getAllEmployees() {
		return hibernateTemplate.loadAll(Employee.class);
	}

	@Override
	@Transactional
	public boolean saveEmployee(Employee employee) {
		try {
			hibernateTemplate.save(employee);
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	@Transactional
	public boolean deleteEmployee(String empId) {
		Session session = null;
		try {

			

		} catch (DataAccessException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return false;
	}

}
