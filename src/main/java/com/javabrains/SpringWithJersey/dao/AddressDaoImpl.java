package com.javabrains.SpringWithJersey.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.javabrains.SpringWithJersey.dao.interfaces.IAddressDao;
import com.javabrains.SpringWithJersey.dao.interfaces.IEmployeeDao;
import com.javabrains.SpringWithJersey.model.Address;
import com.javabrains.SpringWithJersey.model.Employee;

@Component
public class AddressDaoImpl implements IAddressDao {

	@Autowired
	public IEmployeeDao iEmployeeDao;

	@Autowired
	public HibernateTemplate hibernateTemplate;

	@Override
	public boolean saveAddressOfUser(String empId, Address address) {
		try {
			Employee employee = iEmployeeDao.findByEmpId(empId);
			employee.getListOfAddress().add(address);
			hibernateTemplate.save(employee);
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Address> getAllAddressOfUser(String empId) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Address.class);
		criteria.add(Restrictions.eq("employee_empid", empId));
		List<Address> listAddress = (List<Address>) hibernateTemplate.findByCriteria(criteria);
		return listAddress;
	}

}
