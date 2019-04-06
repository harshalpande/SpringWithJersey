package com.javabrains.SpringWithJersey.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.javabrains.SpringWithJersey.model.PPC;
import com.javabrains.SpringWithJersey.repository.interfaces.IHello;

@Component
public class HelloWorldManager implements IHello {

	@Override
	public String getHelloWorld() {
		return "Hello World..!";
	}

	@Value("${environment.name}")
	private String environmentName;

	@Value("${localhost}")
	private String localhost;

	@Value("${database}")
	private String database;

	@Value("${userid}")
	private String userid;

	@Value("${password}")
	private String password;

	@Override
	public List<PPC> getList() {
		
		List<PPC> list = new ArrayList<>();
		list.add(new PPC("Environment Name", getEnvironmentName()));
		list.add(new PPC("Localhost", getLocalhost()));
		list.add(new PPC("Database", getDatabase()));
		list.add(new PPC("UserId", getUserid()));
		list.add(new PPC("Password", getPassword()));
		return list;
	}

	public String getEnvironmentName() {
		return environmentName;
	}

	public void setEnvironmentName(String environmentName) {
		this.environmentName = environmentName;
	}

	public String getLocalhost() {
		return localhost;
	}

	public void setLocalhost(String localhost) {
		this.localhost = localhost;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
