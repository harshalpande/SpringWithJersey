package com.javabrains.SpringWithJersey.repository;

import org.springframework.stereotype.Component;

import com.javabrains.SpringWithJersey.repository.interfaces.IHello;

@Component
public class HelloWorldManager implements IHello {

	@Override
	public String getHelloWorld() {
		return "Hello World..!";
	}

}
