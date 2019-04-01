package com.javabrains.SpringWithJersey.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javabrains.SpringWithJersey.repository.HelloWorldManager;
import com.javabrains.SpringWithJersey.repository.IDefaultInterFace;

@Component
@Path("/default")
public class HelloWorld {
	
	@Autowired
	public IDefaultInterFace helloWorldManager;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getHelloWorld() {
		return helloWorldManager.getHelloWorld();
	}

}
