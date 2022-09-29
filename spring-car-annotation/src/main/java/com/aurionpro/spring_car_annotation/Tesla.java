package com.aurionpro.spring_car_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tesla implements Car {
	@Autowired
	@Qualifier("electric")
	private Engine engine;
	
	@Value("Tesla")
	private String name;

	public String getName() {
		return name;
	}

	@Override
	public String startingCar() {
		return "Tesla is Started ";
	}

	@Override
	public String stoppingCar() {
		return "Tesla is stoped";
	}

	@Override
	public String getEngine() {
		return engine.getEngine();
	}

}
