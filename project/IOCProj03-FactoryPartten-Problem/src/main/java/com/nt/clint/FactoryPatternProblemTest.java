package com.nt.clint;

import com.nt.comps.AadharDetails;
import com.nt.comps.Customer;
import com.nt.comps.Employee;
import com.nt.comps.Person;
import com.nt.comps.Student;

public class FactoryPatternProblemTest {
	public static void main(String[] args) {
		//create AadharDetails class obj
		AadharDetails detail = new AadharDetails(926038146595l, 24, 7609018831l);//dependent class obj
		Person emp = new Employee("satyam", "arnapur", detail, "HCL", 10000.00);
		System.out.println(emp);   //target class
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=---====----====----=====------======-----===---===--==----");
		
		AadharDetails detail1 = new AadharDetails(926038146594l, 25, 7381937817l); //dependent class obj
		Person student = new Student("Kunu", "Arnapur", detail1, "Java", 21);
		System.out.println(student);    //target class
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=---====----====----=====------======-----===---===--==----");
		
		AadharDetails detail2 = new AadharDetails(926038146594l, 25, 7381937817l); //dependent class obj
		Person custmour = new Customer("jack","delhi", detail2, 1199,2020.45);
		System.out.println(custmour);
	}
}
