package com.javabrains.SpringWithJersey.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javabrains.SpringWithJersey.dao.interfaces.IAddressDao;
import com.javabrains.SpringWithJersey.model.Address;
import com.javabrains.SpringWithJersey.repository.interfaces.IAddress;

@Component
public class AddressManager implements IAddress {

	@Autowired(required = true)
	IAddressDao iAddressDao;

	@Override
	public boolean saveAddressOfUser(String empId, Address address) {
		return iAddressDao.saveAddressOfUser(empId, address);
	}

	@Override
	public List<Address> getAllAddressOfUser(String empId) {
		return iAddressDao.getAllAddressOfUser(empId);
	}

}
