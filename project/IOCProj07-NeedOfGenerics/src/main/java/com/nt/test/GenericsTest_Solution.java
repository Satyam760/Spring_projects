package com.nt.test;

import java.lang.reflect.Constructor;
import java.util.Date;

public class GenericsTest_Solution {
	
	public static  <T> T   getInstance(Class<T> clazz)throws Exception {
		   Constructor cons[]=clazz.getDeclaredConstructors();
		   return  (T) cons[0].newInstance();
	}
	
	
	
	public static void main(String[] args) {
		try {
		  Employee  emp=getInstance(Employee.class);
		 System.out.println(emp);
		 System.out.println("_________________");
		 
		  Customer cust=getInstance(Customer.class);
			 System.out.println(cust);
			 
			 Student st=getInstance(Student.class);
			 System.out.println(st);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
