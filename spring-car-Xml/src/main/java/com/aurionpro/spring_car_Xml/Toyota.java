package com.aurionpro.spring_car_Xml;

public class Toyota implements Car {
	private String country;

	public Toyota(String country) {
		super();
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String getBrandName() {
		return "Toyota";
	}

	@Override
	public String getcolor() {
		return "White";
	}

	@Override
	public String getMaxSpeed() {
		return "190 km/h";
	}

	@Override
	public String getModel() {
		return "Fortuner";
	}

	@Override
	public String getEngineType() {
		return "Diesel Engine";
	}

}
