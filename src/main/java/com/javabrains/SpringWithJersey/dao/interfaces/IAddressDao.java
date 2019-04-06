package com.javabrains.SpringWithJersey.dao.interfaces;

import java.util.List;

import com.javabrains.SpringWithJersey.model.Address;

public interface IAddressDao {
	
	boolean saveAddressOfUser(String empId, Address address);
	
	List<Address> getAllAddressOfUser(String empId);
	
}
