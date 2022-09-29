package com.aurionpro.spring_car_Xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Car Spring XML");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resource/applicationContext.xml");
		Tesla obj1 = context.getBean("tesla", Tesla.class);
		System.out.println("*****Details of " + obj1.getBrandName() + "******");
		System.out.println("Model: " + obj1.getModel() );
		System.out.println("Max Speed: " + obj1.getMaxSpeed() );
		System.out.println("Color: "+obj1.getcolor());
		System.out.println("Engine Type: "+obj1.getEngineType());
		System.out.println("Country of origin: "+obj1.getCountry());
		
		System.out.println("----------------------------------------------------");
		
		Toyota obj2= context.getBean("toyota",Toyota.class);
		System.out.println("*****Details of " + obj2.getBrandName() + "******");
		System.out.println("Model: " + obj2.getModel() );
		System.out.println("Max Speed: " + obj2.getMaxSpeed() );
		System.out.println("Color: "+obj2.getcolor());
		System.out.println("Engine Type: "+obj2.getEngineType());
		System.out.println("Country of origin : "+obj2.getCountry());

		
		
		
	}
}
