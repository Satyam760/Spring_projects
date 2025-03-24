package com.nt.factory;

import com.nt.comps.AadharDetails;
import com.nt.comps.Customer;
import com.nt.comps.Employee;
import com.nt.comps.Person;
import com.nt.comps.Student;

public class PersonFactory {
	//public static Factory method creating and returning One of Person(AC) sub class object
	//this method contains factory pattern logic
	public static Person getInstance(String personType) {
		Person per=null;
		if(personType.equalsIgnoreCase("emp")) {
			AadharDetails detail=new AadharDetails(8888888l, 30, 7779788870l);//dependent class obj
			per=new Employee("satyam", "arnapur", detail, "HCL", 10000.00);
		}
		else if(personType.equalsIgnoreCase("student")) {
			AadharDetails detail1 = new AadharDetails(926038146594l, 25, 7381937817l); //dependent class obj
			per = new Student("Kunu", "Arnapur", detail1, "Java", 21);
		}
		else if(personType.equalsIgnoreCase("custmour")) {
			AadharDetails detail2 = new AadharDetails(926038146594l, 25, 7381937817l); //dependent class obj
			per = new Customer("jack","delhi", detail2, 1199,2020.45);
		}
		else {
			throw new IllegalAccessError("Invalid Person Type");
		}
		return per;
	}
}
