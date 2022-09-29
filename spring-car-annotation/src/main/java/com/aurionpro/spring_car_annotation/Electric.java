package com.aurionpro.spring_car_annotation;

import org.springframework.stereotype.Component;

@Component
public class Electric implements Engine {

	@Override
	public String getEngine() {
		return "Electric engine";
	}

}
