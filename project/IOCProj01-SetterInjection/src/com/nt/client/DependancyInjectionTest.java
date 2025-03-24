package com.nt.client;

import com.nt.sbeans.WishMessageGenerator;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DependancyInjectionTest {
	
	public static void main(String[] args) {
		//create the ioc container
		FileSystemXmlApplicationContext ctx =
			  new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		//get target Spring bean class obj  from the IOC container
		Object obj = ctx.getBean("wmg");
		//String result = obj.generateWishMessage("Satyam");we can't store sup class obj need type casting
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		//invoke the b.method
		String result = generator.generateWishMessage("Satyam");
		System.out.println("Result : "+result);
		//close the IOC container
		ctx.close();
	}//main method
}//class
