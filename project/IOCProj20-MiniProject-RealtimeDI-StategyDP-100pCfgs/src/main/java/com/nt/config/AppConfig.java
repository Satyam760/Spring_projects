package com.nt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.nt")
@ImportResource("com/nt/cfgs/applicationContext.xml")
@PropertySource("com/nt/commons/Info.properties")
public class AppConfig {
	
//	  @Value("${jdbc.driver}") 
//	  private String driver;
//	  
//	  @Value("${jdbc.url}") 
//	  private String url;
//	  
//	  @Value("${jdbc.username}") 
//	  private String user;
//	  
//	  @Value("${jdbc.password}") 
//	  private String pwd;
//	  
//	  @Bean(name="hkDs") 
//	  public HikariDataSource createDS() { 
//		  HikariDataSource hkDs=new HikariDataSource(); 
//		  hkDs.setDriverClassName(driver);
//		  hkDs.setJdbcUrl(url);
//		  hkDs.setUsername(user);
//		  hkDs.setPassword(pwd);
//		  return hkDs; 
//	  }
	 
	
	@Autowired
	 private Environment  env;
	
	@Bean(name="hkDs")
	public  HikariDataSource  createDS() {
		HikariDataSource  hkDs=new HikariDataSource();
		hkDs.setDriverClassName(env.getProperty("jdbc.driver"));
		hkDs.setJdbcUrl(env.getProperty("jdbc.url"));
		hkDs.setUsername(env.getProperty("jdbc.username"));
		hkDs.setPassword(env.getProperty("jdbc.password"));
		return  hkDs;
	}

}
