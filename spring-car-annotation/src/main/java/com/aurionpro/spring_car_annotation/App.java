package com.aurionpro.spring_car_annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/resource/applicationContext.xml");
		Tesla tesla = context.getBean("tesla",Tesla.class);
		System.out.println(tesla.getName());
		System.out.println(tesla.startingCar());
		System.out.println(tesla.stoppingCar());
		System.out.println(tesla.getEngine());
		
		System.out.println("------------------------------------------------------");
		
		Toyota toyota = context.getBean("toyota",Toyota.class);
		System.out.println(toyota.getName());
		System.out.println(toyota.startingCar());
		System.out.println(toyota.stoppingCar());
		System.out.println(toyota.getEngine());
		
	}
}	
