package com.suntossh.main.model;

public class Employee {

	private final int id;
	private final String name;
	private final int age;
	private final String sex;

	public Employee(int id, String name, int age, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getSex() {
		return sex;
	}

}
