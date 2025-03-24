package com.nt.clint;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.servicer.BankService;

public class MethodInjectionTest {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx = 
				   new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get target class obj ref
		BankService service = ctx.getBean("bankService",BankService.class);
		System.out.println(service.getClass()+" "+service.getClass().getSuperclass());
		
		//invoke the b.method
		double InterAmt=service.calculateIntrestAmount(200000,12,1);
		System.out.println("Intrest Amount is :: "+InterAmt);
		
		//close container
		ctx.close();
		
	}

}
