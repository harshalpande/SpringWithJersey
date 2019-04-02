package com.javabrains.SpringWithJersey.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.javabrains.SpringWithJersey.rest.EmployeeResource;
import com.javabrains.SpringWithJersey.rest.HelloWorld;

@Component
@ApplicationPath("/SpringWithJersey")
public class ApplicationConfig extends ResourceConfig {

	public ApplicationConfig() {
		
		register(HelloWorld.class);
		register(EmployeeResource.class);
	}

}
