package com.javabrains.SpringWithJersey.repository.interfaces;

import java.util.List;

import com.javabrains.SpringWithJersey.model.Address;

public interface IAddress {
	
	boolean saveAddressOfUser(String empId, Address address);
	
	List<Address> getAllAddressOfUser(String empId);
}
