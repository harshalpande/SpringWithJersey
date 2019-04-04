package com.javabrains.SpringWithJersey.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
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
			hibernateTemplate.persist(employee);
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	@Transactional
	public boolean deleteEmployeeByEmpId(String empId) {
		try {
			Employee employee = findByEmpId(empId);
			if (employee == null) {
				return false;
			}
			hibernateTemplate.delete(employee);
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Employee findByEmpId(String empId) {
		Employee employee = null;
		DetachedCriteria criteria = DetachedCriteria.forClass(Employee.class);
		criteria.add(Restrictions.eq("empid", empId));
		List<Employee> listEmployee = (List<Employee>) hibernateTemplate.findByCriteria(criteria);
		if (listEmployee.size() > 0) {
			employee = listEmployee.get(0);
		} else {
			employee = null;
		}
		return  employee;
	}

}
