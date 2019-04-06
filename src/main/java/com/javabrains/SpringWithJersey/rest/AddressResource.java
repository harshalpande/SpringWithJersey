package com.javabrains.SpringWithJersey.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.javabrains.SpringWithJersey.model.Address;
import com.javabrains.SpringWithJersey.repository.interfaces.IAddress;

@Repository
@Path("{empId}/address")
public class AddressResource {

	@Autowired
	public IAddress iAddress;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean saveAddressOfUser(Address address, @PathParam("empId") String empId) {
		return iAddress.saveAddressOfUser(empId, address);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Address> getAllAddressOfUser(@PathParam("empId") String empId) {
		return iAddress.getAllAddressOfUser(empId);
	}

}
