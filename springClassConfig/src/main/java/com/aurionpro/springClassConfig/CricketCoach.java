package com.aurionpro.springClassConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cricketCoach")
public class CricketCoach implements DietService{
	private DietService diet;
	
	

	@Autowired
	public CricketCoach(DietService diet) {
		super();
		this.diet = diet;
	}

	public String getTrainingDetails() {
		return "Practicing in net for 2 hr";

	}

	@Override
	public String getDiet() {
		// TODO Auto-generated method stub
		return diet.getDiet();
	}
}
