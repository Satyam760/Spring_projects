package com.nt.test;

import com.nt.singleton.Printer;

public class SingletonTest {
	public static void main(String[] args) {
		Printer p1=Printer.getInstance();
		Printer p2=Printer.getInstance();
		p1.print("hi satyam");
		p2.print("hi kunu");
		System.out.println("p1 = "+p1.hashCode()+ "  " +"p2 = "+p2.hashCode());
		System.out.println("p1=p2 is::"+(p1==p2));
	}
}
