package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class JavaConfigAppTest {

	public static void main(String[] args) {
		//create IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get target spring bean class ref
		WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class);
		//invoke the b.method
		String result = generator.generatorWishMessage("Satyam");
		System.out.println("Result is::"+result);
		//close container
		ctx.close();
	}//main

}//class
