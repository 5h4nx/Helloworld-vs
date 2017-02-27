package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;




@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class HelloWorldApplication {
 
	 
	public static void main(String[] args) {
		//SpringApplication.run(HelloWorldApplication.class, args);
		System.out.println("Before starting app");
		 SpringApplication.run(HelloWorldApplication.class, args);
		 System.out.println("starting app");
		  
//	        String[] beanNames = ctx.getBeanDefinitionNames();
//	         
//	        Arrays.sort(beanNames);
//	         
//	        for (String beanName : beanNames) 
//	        {
//	            System.out.println(beanName);
//	        }
	}
}
