package com.aurionpro.spring_car_Xml;

public class Tesla implements Car {
	
	private String country;

	public Tesla(String country) {
		super();
		this.country = country;
	}

	

	@Override
	public String getBrandName() {
		return "Tesla";
	}

	@Override
	public String getcolor() {
		return "Black";
	}

	@Override
	public String getMaxSpeed() {
		return "250 km/h";
	}

	@Override
	public String getModel() {
		return "Model X";
	}

	@Override
	public String getEngineType() {
		return "Electric ";
	}



	public String getCountry() {
		return country;
	}



	


}
