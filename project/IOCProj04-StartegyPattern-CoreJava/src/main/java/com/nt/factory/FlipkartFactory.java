//Factory class

package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;

public class FlipkartFactory {
//static factory method
	public static Flipkart getInstance(String courierType) {
		//create dependent class obj
		Courier  courier = null;
		if(courierType.equalsIgnoreCase("dtdc")) 
			courier=new DTDC();
		else if(courierType.equalsIgnoreCase("blueDart")) 
			courier=new BlueDart();
		else
			throw new IllegalArgumentException("invalid courie type");
		
		//create target class obj
		Flipkart fpkt = new Flipkart();
		//assign dependent class obj to target class obj
		fpkt.setCourier(courier);
		return fpkt;
	}
}
