package com.javabrains.SpringWithJersey.repository;

public class HelloWorldManager implements IDefaultInterFace {

	@Override
	public String getHelloWorld() {
		return "Hello World..!";
	}

}
