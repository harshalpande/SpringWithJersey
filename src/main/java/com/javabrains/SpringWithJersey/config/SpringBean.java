package com.javabrains.SpringWithJersey.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.javabrains.SpringWithJersey.repository.HelloWorldManager;
import com.javabrains.SpringWithJersey.repository.IDefaultInterFace;

@Configuration
public class SpringBean {
	
	@Bean(value="helloWorldManager")
	public IDefaultInterFace helloWorldManager() {
		return new HelloWorldManager();
	}

}
