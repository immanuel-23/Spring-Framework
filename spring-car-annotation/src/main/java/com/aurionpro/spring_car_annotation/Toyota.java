package com.aurionpro.spring_car_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Toyota implements Car {
	@Autowired
	@Qualifier("diesel")
	private Engine engine;
	
	@Value("toyota")
	private String name;


	public String getName() {
		return name;
	}

	@Override
	public String startingCar() {
		return "Fortuner is started";
	}

	@Override
	public String stoppingCar() {
		return "Fortuner is stoped";
	}

	@Override
	public String getEngine() {
		return engine.getEngine();
	}

}
