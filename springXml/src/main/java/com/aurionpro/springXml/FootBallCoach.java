package com.aurionpro.springXml;

public class FootBallCoach implements Coach {
	private DietService diet;


	public FootBallCoach(DietService diet) {
		super();
		this.diet = diet;
	}
	public FootBallCoach() {
		super();
		this.diet = diet;
	}

	@Override
	public String getTrainingDetails() {
		// TODO Auto-generated method stub
		return "It's goal";
	}

	@Override
	public String getDiet() {
		// TODO Auto-generated method stub
		return diet.getDiet();
	}

}
