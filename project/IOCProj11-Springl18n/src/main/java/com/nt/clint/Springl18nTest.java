package com.nt.clint;

import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springl18nTest {

	public static void main(String[] args) {
		//create AC container
		ClassPathXmlApplicationContext ctx= 
				 new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//Get message from properties file according to the local we submit
		Locale locale = new Locale(args[0],args[1]);
		String msg = ctx.getMessage("wish.msg", new String[] {},locale);
		String msg1 = ctx.getMessage("bye.msg",new String[] {},locale);
		//print the message
		System.out.println(msg);
		System.out.println(msg1);

	}

}
