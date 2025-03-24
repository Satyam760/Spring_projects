//ClientApp
package com.nt.clint;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Flipkart;
public class StrategyDP_FactoryDPTest {

	public static void main(String[] args) {
		
		//create  IOC container
		/*FileSystemXmlApplicationContext ctx=
				new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml"); */
		
		/*FileSystemXmlApplicationContext ctx=new
				            FileSystemXmlApplicationContext("E:\\Worskpaces\\Spring\\NTSPBMS716\\IOCProj07-StrategyDP-FactoryDP-UsingSpring\\src\\main\\java\\com\\nt\\cfgs\\applicationContext.xml");
		
		*/
		   AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		   
		///get Target spring bean class obj ref
		Flipkart fpkt=(Flipkart)ctx.getBean("fpkt");		
		 //invoke the b.method
		 String resultMsg=fpkt.shopping(new String[] {"kurtha-piajama","pathaani","atthar","sweets"},
				                                                      new double[] {2000.0,300.0,1000.0,600.0});
		 System.out.println(resultMsg);
		
		 //close the cotnainer
		 ctx.close();
		}//main

}//class
