package com.nt.test;

import java.lang.reflect.Constructor;

public class GenericsTest_Solution1 {
	
	public static  <T extends Person> T   getInstance1(Class<T> clazz)throws Exception {
		   Constructor cons[]=clazz.getDeclaredConstructors();
		   return  (T) cons[0].newInstance();
	}
	
	
	
	public static void main(String[] args) {
		try {
		  Employee  emp=getInstance1(Employee.class);
		 System.out.println(emp);
		 System.out.println("_________________");
		 
		  Customer cust=getInstance1(Customer.class);
			 System.out.println(cust);
		
				/*Student st=getInstance1(Student.class);  //gives  compile time error
				 System.out.println(st); */
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
