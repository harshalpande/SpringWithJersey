package com.javabrains.SpringWithJersey.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;

import com.javabrains.SpringWithJersey.model.Employee;
import com.javabrains.SpringWithJersey.repository.interfaces.IEmployee;

@Path("/employees")
public class EmployeeResource {

	@Autowired
	public IEmployee iEmployee;
	
	@Autowired
	public AddressResource addressResource;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllEmployees() {
		return Response.status(Status.OK).entity(iEmployee.getAllEmployees()).build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveEmployee(Employee employee) {
		return Response.status(Status.CREATED).entity(iEmployee.saveEmployee(employee)).build();
	}

	@DELETE
	public Response deleteEmployeeByEmpId(@QueryParam("empId") String empId) {
		boolean isDeleted = iEmployee.deleteEmployeeByEmpId(empId);
		if (isDeleted) {
			return Response.status(Status.OK).entity(isDeleted).build();
		} else {
			return Response.status(Status.NOT_IMPLEMENTED).entity(isDeleted).build();
		}
	}

	@GET
	@Path("/{empId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeeByEmpId(@PathParam("empId") String empId) {
		Employee employee = iEmployee.findByEmpId(empId);
		if (employee == null) {
			return Response.status(Status.NO_CONTENT).build();
		}
		return Response.status(Status.FOUND).entity(employee).build();
	}
	
	@Path("{empId}/address")
	public AddressResource getAddress() {
		return addressResource;
	}

}
