package com.nt.clint;

import com.nt.comps.Person;
import com.nt.factory.PersonFactory;

public class FactoryPatternSolutionTest {

	public static void main(String[] args) {
		Person emp = PersonFactory.getInstance("emp");
		System.out.println(emp);
		System.out.println();
		
		Person stud = PersonFactory.getInstance("student");
		System.out.println(stud);
		System.out.println();
		
		Person cust = PersonFactory.getInstance("custmour");
		System.out.println(cust);
	}

}
