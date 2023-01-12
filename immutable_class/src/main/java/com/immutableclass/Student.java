package com.immutableclass;

public class Student {

	String name;
	int roll;
	Address add;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int roll, Address add) {
		super();
		this.name = name;
		this.roll = roll;
		Address ad =(Address)add;
		this.add=ad;
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", add=" + add + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public Address getAdd() {
		Address ad = new Address(add.getCity(),add.getPin());
		return ad;
	}
//	public void setAdd(Address add) {
//		this.add = add;
//	}
	
	
	
	
}
