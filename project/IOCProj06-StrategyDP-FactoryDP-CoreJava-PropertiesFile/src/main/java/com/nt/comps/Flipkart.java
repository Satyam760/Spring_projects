package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	  //HAS-A property
	private  Courier  courier;
	
	public Flipkart() {
		System.out.println("Flipkart:: 0-param constructor");
	}
	
	//setter method for  injection (assigning dependent class obj to target class obj)
	public void  setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier(-)");
		this.courier=courier;
	}
	
	//b.method
	public  String  shopping(String items[],double prices[]) {
		 // calculate bill amount
		  double total=0.0;
		  for(double p: prices) 
			  total=total+p;
		 //generate  random number as the order id
		  int oid=new Random().nextInt(1000);
		  //use   courier
		  String msg=courier.deliver(oid);
		  return  Arrays.toString(items)+" are purchased having prices "+Arrays.toString(prices)+ " , bill amt :"+total+" ---> "+msg;
		  
		  
	}

}
