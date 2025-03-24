package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Cricketer;

public class DependencyLookupTest {

	public static void main(String[] args) {
		//create IOC container 
		ClassPathXmlApplicationContext ctx = 
				  new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get target class obj 
		Cricketer cktr = ctx.getBean("cktr",Cricketer.class);
		//invoke b.method
		cktr.batting();
		cktr.bowling();
		cktr.fileding();
		cktr.wicketKeeping();
		//close the container
		ctx.close();

	}//main

}//class
