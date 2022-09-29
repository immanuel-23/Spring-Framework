package com.aurionpro.springXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/resource/applicationContext.xml");
		
		CricketCoach cricketcoach = context.getBean("cricketcoach", CricketCoach.class);
		//Coach cricketcoach1 = context.getBean("cricketcoach", Coach.class);
		// beans always return same object it doesnt create a new object (singelton)
		//System.out.println(cricketcoach.equals(cricketcoach1));
		// if u want always different object to be created use scope="prototype"
		System.out.println(cricketcoach.getName());
		
		System.out.println(cricketcoach.getDiet());
		
		System.out.println(cricketcoach.getCountry());

		
		Coach footballcoach=context.getBean("foodballcoach",Coach.class);
		
		System.out.println(footballcoach.getDiet());
		context.close();
	}
	
}
