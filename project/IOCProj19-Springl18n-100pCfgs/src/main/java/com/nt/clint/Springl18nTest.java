package com.nt.clint;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.AppConfig;

public class Springl18nTest {

	public static void main(String[] args) {
		
		  //create AC container 
	//	ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		  
//		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
//		  //Get message from properties file according to the local we submit 
//		  Locale locale = new Locale(args[0],args[1]); 
//		  String msg = ctx.getMessage("wish.msg",new String[] {},locale); 
//		  String msg1 = ctx.getMessage("bye.msg",new String[] {},locale); //print the message 
//		  System.out.println(msg);
//		  System.out.println(msg1);
		 
			
		//  read language, country from enduser
			try(Scanner sc=new Scanner(System.in);
				    AnnotationConfigApplicationContext  ctx=new AnnotationConfigApplicationContext(AppConfig.class);){
				  System.out.println("Enter language code ::");
				  String lang=sc.next();
				  System.out.println("Enter   country code ::");
				  String  country=sc.next();
				  //prepare Locale obj having language, country
				  Locale locale=new Locale(lang,country);
				  
				  //get messages from IOC container based on Locale object data we pass
				  String msg1=ctx.getMessage("wish.msg", new Object[] {"raja"}, locale);
				  String msg2=ctx.getMessage("bye.msg", new Object[] {"raja"}, locale);
				  System.out.println(msg1+"    "+msg2);
				  
				  
			}//try
			catch(Exception e) {
				e.printStackTrace();
			}

	}

}
