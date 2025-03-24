package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pInfo")
//@PropertySource("com/nt/commons//myfiles.properties")
public class PersonalInfo {
	//inject values collected from the properties file
	@Value("${per.name}")
	private String name;
	@Value("${per.addrss}")
	private String addrs;
	@Value("${per.age}")
	private Integer age;
	
	//inject the direct value
	@Value("759016")
	private Long pinCode;
	
	//inject the system properties value
	@Value("${os.name}")
	private String osName;
	
	@Value("${os.version}")
	private String osVersion;
	
	//Injecting env... variable values
	@Value("${Path}")
	private String pathData;
	
	//toString method
	@Override
	public String toString() {
		return "PersonalInfo" +"\n"+
	                       " name=" + name + "\n"+
				           " addrs=" + addrs + "\n"+
				           " age=" + age + "\n"+
				           " pinCode=" + pinCode + "\n"+
				           " osName="+ osName + "\n"+
				           " osVersion=" + osVersion + "\n"+
				           " pathData=" + pathData;
	}
	
	//toString method
	
	

}
