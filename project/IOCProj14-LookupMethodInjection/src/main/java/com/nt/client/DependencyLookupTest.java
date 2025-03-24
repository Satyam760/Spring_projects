package com.nt.client;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Cricketer;

public class DependencyLookupTest {

	public static void main(String[] args) {
		//create IOC container 
		ClassPathXmlApplicationContext ctx = 
				  new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get target class obj 
		Cricketer cktr = ctx.getBean("cktr",Cricketer.class);
		System.out.println(cktr.getClass()+" "+cktr.getClass().getSuperclass());
		System.out.println(Arrays.toString(cktr.getClass().getDeclaredMethods()));
		//invoke b.method
		cktr.batting();
		cktr.bowling();
		cktr.fileding();
		cktr.wicketKeeping();
		//close the container
		ctx.close();

	}//main

}//class
