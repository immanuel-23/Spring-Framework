package com.aurionpro.springClassConfig;

import org.springframework.beans.factory.annotation.Value;

public class FoodBallCoach implements Coach {
	private DietService diet;
	@Value("${footBallCoach.country}")
	private String country;

	
	public String getCountry() {
		return country;
	}

	
	

	public FoodBallCoach(DietService diet) {
		super();
		this.diet = diet;
	}

	public void setDiet(DietService diet) {
		this.diet = diet;
	}

	@Override
	public String getTrainingDetails() {
		// TODO Auto-generated method stub
		return "Playing foot ball";
	}

	@Override
	public String getDiet() {
		// TODO Auto-generated method stub
		return diet.getDiet();
	}

	
}
