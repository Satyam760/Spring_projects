//Cricketer.java(target class)

package com.nt.sbeans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
@PropertySource("classpath:com/nt/commons/Info.properties")
public class Cricketer implements ApplicationContextAware{
	@Value("${cktr.name}")
	private String name;
	@Value("${cktr.jersyNo}")
	private String jersyNo;
	
	private ApplicationContext ctx=null;
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
		
	}
	
	
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
		
		//perform dependency lookup to get Bat object (dependent class obj)
		//Cricket bat = ctx.getBean("bat",Cricket.class);  //lookup with dependent bean id
		CricketBat bat =ctx.getBean(CricketBat.class);   //lookup with dependent class name
		//invoke the b.method 
		int runs= bat.scoreRuns();
		System.out.println(name+" with jersyNo "+jersyNo+" has scored "+runs+"runs");
		
		
	}
	
}
