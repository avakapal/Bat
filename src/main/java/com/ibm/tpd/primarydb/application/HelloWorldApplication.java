package com.ibm.tpd.primarydb.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author SangitaPal
 *
 */

@SpringBootApplication
@ComponentScan({"com.ibm.tpd.primarydb.helloworld"})
public class HelloWorldApplication {
	
	public static void main(String[] args) {
        
		SpringApplication.run(HelloWorldApplication.class, args);
	}
}
