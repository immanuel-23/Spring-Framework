package com.aurionpro.spring_car_annotation;

import org.springframework.stereotype.Component;

@Component
public class Diesel implements Engine {

	@Override
	public String getEngine() {
		return "Diesel engine";
	}

}
