package com.cogent.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(DemoApplication.class, args);
	
	Car car = ctx.getBean(Car.class);
	car.letsGo();
	}

}
