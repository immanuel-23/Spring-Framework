package com.aurionpro.springXml;

public class CricketCoach implements Coach {
	private DietService diet;
	private String name;
	private String country;

	public CricketCoach(DietService diet ,String name,String country) {
		super();
		this.diet = diet;
		this.name=name;
		this.country=country;
	}
	public String getName() {
		return name;
	}
	
	public void doInit() {
		System.out.println("Inside doInIT METHOD");
	}
	public CricketCoach() {
		super();
		this.diet = diet;
	}
	public void doDestroy() {
		System.out.println("Inside Destroy");
	}

	@Override
	public String getTrainingDetails() {
		// TODO Auto-generated method stub
		return "practice in net for 2 hr";
	}

	@Override
	public String getDiet() {
		return diet.getDiet();
	}
	
	public String getCountry() {
		return country;
	}
	
	

}
