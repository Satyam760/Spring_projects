package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.PersonalInfo;

public class ValueAnnotion {
	public static void main(String[] args) {
		//create IOC container 
		ClassPathXmlApplicationContext ctx = 
				  new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get spring bean class obj ref
		PersonalInfo info = ctx.getBean("pInfo",PersonalInfo.class);
		System.out.println(info);
		
		//close ioc container
		ctx.close();
		
		
	}

}
