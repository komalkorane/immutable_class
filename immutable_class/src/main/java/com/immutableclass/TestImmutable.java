package com.immutableclass;

public class TestImmutable {

	public static void main(String[] args) {

		Address add = new Address("Pune",1234);
		Student s = new Student("Komal",10,add);
		System.out.println(s);
		
		
		
	}

}
