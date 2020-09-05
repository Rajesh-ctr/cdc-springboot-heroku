package com.cdc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.cdc"})
public class CdcSpringbootHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(CdcSpringbootHerokuApplication.class, args);
	}

}