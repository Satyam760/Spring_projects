//Cricketer.java(target class)

package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
@PropertySource("classpath:com/nt/commons/Info.properties")
public abstract class Cricketer {
	@Value("${cktr.name}")
	private String name;
	@Value("${cktr.jersyNo}")
	private String jersyNo;
	
	@Lookup
	public abstract CricketBat getBat();
	
	public Cricketer() {
		System.out.println("Cricket::0-param constructor");
	}
	
	public void fileding() {
		System.out.println(name+" with jersyNo:: "+jersyNo+" is fielding");
	}
	
	public void bowling() {
		System.out.println(name+" wihth jersyNo:: "+jersyNo+" is blowling");
	}
	
	public void wicketKeeping() {
		System.out.println(name+" with jersyNo:: "+jersyNo+" is keeping the wicket");
	}
	
	public void batting() {
		//get dependent class obj
		CricketBat bat = getBat();
		int runs= bat.scoreRuns();
		System.out.println(name+" with jersyNo "+jersyNo+" has scored "+runs+"runs");
		
		
	}
	

}
