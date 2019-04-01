package com.javabrains.SpringWithJersey.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.javabrains.SpringWithJersey.model.Employee;
import com.javabrains.SpringWithJersey.repository.HelloWorldManager;
import com.javabrains.SpringWithJersey.rest.HelloWorld;

@ApplicationPath("/SpringWithJersey")
public class ApplicationConfig extends Application {

	@Override
	public Set<Class<?>> getClasses() {

		Set<Class<?>> classSet = new HashSet<>();
		// Models
		classSet.add(Employee.class);

		// Resources
		classSet.add(HelloWorld.class);
		
		// Repository
		classSet.add(HelloWorldManager.class);
		
		return classSet;
	}

}
