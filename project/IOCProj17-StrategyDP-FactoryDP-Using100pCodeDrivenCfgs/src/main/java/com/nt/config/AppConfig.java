package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = "com/nt/cfgs/applicationContext.xml")
@ComponentScan(basePackages = "com.nt.sbeans")
public class AppConfig {

}
