package com.aurionpro.spring.annotation;

import org.springframework.stereotype.Component;

@Component("abcd")
public class WeightLossDiet implements DietService {

	@Override
	public String getDiet() {
		// TODO Auto-generated method stub
		return "reduce fats";
	}

}
