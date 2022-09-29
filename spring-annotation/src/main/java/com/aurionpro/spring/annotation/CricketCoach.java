package com.aurionpro.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	private DietService diet;
	
	
//	@Autowired
//	///@Qualifier("weightGainDiet")
//	@Primary
//	public void setDiet(DietService diet) {
//		this.diet = diet;
//		
//	}

	@Override
	public String getTrainingDetails() {
			
		return "Playing cricket for last 2 hr";
	}

	@Override
	public String getDiet() {
		
		return diet.getDiet();
	}
	@Autowired
	public void createDietService(DietService diet) {
		this.diet=diet;
	}
	@Autowired
	public CricketCoach() {
		super();
	}

	public CricketCoach(@Qualifier("weightGainDiet")DietService diet) {
		super();
		this.diet = diet;
		// wen we use qualifier on construtor is should be with parameters
	}
	
}
