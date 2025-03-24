
package com.nt.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.nt.comps.Courier;
import com.nt.comps.Flipkart;

public class FlipkartFactory {
	private static Properties props; 
	static {
		try {
			//load the properties file  using stream
			InputStream is=new FileInputStream("src/main/java/com/nt/commons/Info.properties");
			//create Properties class obj
			 props=new Properties();
			props.load(is);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//static
	
    //static  factory method having logic to create Flipkart object having  the given Courier object
	  public   static   Flipkart   getInstance() {
		     // get Dependent class name from the Properties class obj
		       String courierClassName=props.getProperty("courier.name");
		     
		       Courier  courier=null;
		       try {
		    	   //load the dependent class name
		    	   Class c=Class.forName(courierClassName);
		    	   //create the obj for  dependent class using 0-param constructor
		    	   // courier=(Courier) c.newInstance();  //deprected method from java9
		    	   //get all the constructors of the loaded class 
		    	   Constructor<Courier> cons[]=c.getDeclaredConstructors();
		    	   //create the  object for dependent class using 0-param constructor
		    	   courier=cons[0].newInstance();
		       }
		       catch(Exception e) {
		    	   e.printStackTrace();
		       }
		  
		    //create target class obj
		     Flipkart fpkt=new Flipkart();
		     //assign dependent class obj to target class obj
		     fpkt.setCourier(courier);
		     
		     return fpkt;
	  }
}
