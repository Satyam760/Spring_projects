package com.nt.client;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.CustomerOperationsController;
import com.nt.model.Customer;

public class RealtimeDITest1 {

	public static void main(String[] args) {
		//read input value from enduser
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Customer Name::");
		String name=scn.nextLine();
		System.out.println("Enter Customer Address::");
		String addrs=scn.nextLine();
		System.out.println("Enter Customer Bill Amount::");
		double billAmt=scn.nextDouble();
		System.out.println("Enter  discount percentage::");
		double discount=scn.nextDouble();
				
		//create customer class  obj
		Customer cust = new Customer();
		cust.setCname(name);
		cust.setCaddrs(addrs);
		cust.setBillAmount(billAmt); 
		cust.setDiscount(discount);
				
		//create IOC Container 
		try(ClassPathXmlApplicationContext ctx= 
						 new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");){
				
		//get controller class object from the IOC Container (Dependence lookup)
		CustomerOperationsController controller = 
						 ctx.getBean("custController",CustomerOperationsController.class);
		//invoke the b.method
		 try {
			 String msgResult= controller.processCustomer(cust);
			 System.out.println(msgResult);
			 }//try
		   	 catch(SQLException se) {
			  if(se.getErrorCode()==12899)
				 System.out.println("Problem with colum size");
			  else
				 System.out.println("One or another DB problem");
			 }
			 catch(Exception e) {
				 e.printStackTrace();
			 }
		 }//try
		scn.close();
	}//main
}//class
