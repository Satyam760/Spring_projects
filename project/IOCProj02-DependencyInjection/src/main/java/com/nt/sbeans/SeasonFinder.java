package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	
	@Autowired
	private LocalDate date;
	
	public SeasonFinder() {
		System.out.println("Season Finder::0-param constructor");
	}
	
	public String findoutSeasonName(String user) {
		System.out.println("SeasonFinder.findoutSeasonName()");
		//get current month value
		int month = date.getMonthValue();
		//show the season name
		if(month>=3&&month<=6)
			return "Hot Summer Season Wish to ::"+user;
		else if(month>=7&&month<=10)
			return "Drizziling Monsoon Wish to"+user;
		else
			return "Cool Winter wish to "+user;
	}//method
	
}//class
