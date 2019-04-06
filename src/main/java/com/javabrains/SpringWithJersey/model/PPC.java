package com.javabrains.SpringWithJersey.model;

public class PPC {
	
	String key;
	
	String value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public PPC() {
		// TODO Auto-generated constructor stub
	}
	
	public PPC(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "PPC [key=" + key + ", value=" + value + "]";
	}
	
}
