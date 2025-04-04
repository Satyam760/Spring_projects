package com.nt.comps;

public abstract class Person {
	private String name;
	private String addrs;
	private AadharDetails aadhar;  //Has-A property
	
	public Person(String name, String addrs, AadharDetails aadhar) {
		System.out.println("Person:3-param constructor");
		this.name = name;
		this.addrs = addrs;
		this.aadhar = aadhar;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", addrs=" + addrs + ", aadhar=" + aadhar + "]";
	}
	
}
