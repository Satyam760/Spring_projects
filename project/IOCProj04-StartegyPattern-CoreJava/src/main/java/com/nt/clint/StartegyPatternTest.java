//clint App

package com.nt.clint;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StartegyPatternTest {
	public static void main(String[] args) {
		//get target class obj (Flipkart class obj) from Factory 
		 Flipkart fpkt = FlipkartFactory.getInstance("dtdc");
		 String resultMsg = fpkt.shopping(new String[] {"candles","flowers","cake","wine"},
				                          new double[]{2000.0,3000.0,4000.0,1000.0});
		 System.out.println(resultMsg);
		  
		  System.out.println();
		
		Flipkart fpkt1 = FlipkartFactory.getInstance("blueDart");
		String resultMsg1 = fpkt1.shopping(new String[] {"candles","flowers","cake","wine"},
				                         new double[] {2000.0,300.0,400.0,100.0});
		System.out.println(resultMsg1);
		
		/*
		 * System.out.println();
		 * 
		 * Flipkart fpkt2 = FlipkartFactory.getInstance("satyam"); // giving invalid courier type
		 * String resultMsg2 =fpkt2.shopping(new String[] {"candles","flowers","cake","wine"}, 
		 *                                  new double[]{2000.0,3000.0,4000.0,1000.0});
		 *  System.out.println(resultMsg2);
		 */
		
	}
}
