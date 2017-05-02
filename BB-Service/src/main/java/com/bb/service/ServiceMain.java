package com.bb.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan({ "com.bb.*", "com.bb.service.*" })
@EntityScan(basePackages = { "com.bb.model" })
public class ServiceMain {

	public static void main(String args[]) {
		SpringApplication.run(ServiceMain.class, args);
	}

}
