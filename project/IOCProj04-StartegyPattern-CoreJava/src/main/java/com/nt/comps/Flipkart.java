//target class

package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	private Courier courier;   //has-a property
	
	public Flipkart() {
		System.out.println("Flipkart:0-param constructor");
	}

	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier(-)");
		this.courier = courier;
	}
	
	public String shopping(String items[],double prices[]) {
		System.out.println("Flipkart.shopping(-)");
		//calc bill Amt
		double bilAmt=0.0;
		for(double p:prices) {
			bilAmt+=p;
		}
		//generated order id
		int id=new Random().nextInt(100000);
		
		//use courier
		String msg= courier.deliver(id);
		return Arrays.toString(items)+" are purchased having bill Amount "+bilAmt+"----->"+msg;
		
	}
	
}
