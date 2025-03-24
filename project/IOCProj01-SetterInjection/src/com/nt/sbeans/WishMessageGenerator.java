package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	//has-a  property
	@Autowired //3rd
	private LocalDateTime dateTime;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator: 0-param constructor");
	}
	
	//@Autowired //1st
	public WishMessageGenerator(LocalDateTime dateTime) {
		System.out.println("WishMessageGenerator.WishMessageGenerator(1234)");
		this.dateTime = dateTime;
	}
	
	//setter and getter methods
	//@Autowired  //2nd
	public void setDateTime(LocalDateTime dateTime) {
		System.out.println("WishMessageGenerator.setDateTime()");
		this.dateTime = dateTime;
	}
	
	//b.logic
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		//get current hour
		int hour = dateTime.getHour();
		//generator wish message 
		if(hour<12)
			return "Good morning : "+user;
		else if(hour<16)
			return "Good Afternoon : "+user;
		else if(hour<20)
			return "Good Evening : "+user;
		else
			return "Good Night : "+user;
	}
}//class
