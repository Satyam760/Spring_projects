package com.nt.clint;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		//create IOC container
		FileSystemXmlApplicationContext ctx = 
			new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");

		//get target spring bean class obj ref
		//Object obj = ctx.getBean("sf");
		//typecasting
		//SeasonFinder finder = (SeasonFinder)obj;
		SeasonFinder finder = (SeasonFinder)ctx.getBean("sf");//need typecast return obj is object type
		//invoke the b.method
		String result = finder.findoutSeasonName("Satyam Sahoo");
		System.out.println(result);
		
		//close the container
		ctx.close();
		
	}

}
