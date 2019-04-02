package com.javabrains.SpringWithJersey.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.javabrains.SpringWithJersey.repository.interfaces.IHello;

@Path("/hello")
public class HelloWorld {

	@Autowired
	public IHello iHello;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getHelloWorld() {
		return iHello.getHelloWorld();
	}

}
