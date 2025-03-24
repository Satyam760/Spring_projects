package com.nt.client;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDP_FactoryDPTest {

	public static void main(String[] args) {
		//use  Factory pattern class to get Flipkart class obj having our  choice dependent class obj
		 Flipkart fpkt=FlipkartFactory.getInstance();
		 //invoke the b.method
		 String resultMsg=fpkt.shopping(new String[] {"kurtha-piajama","pathaani","atthar","sweets"},
				                                                      new double[] {2000.0,300.0,1000.0,600.0});
		 System.out.println(resultMsg);
		 

	}//main

}//class
