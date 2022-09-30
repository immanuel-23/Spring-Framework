package com.aurionpro.springClassConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:/resource/coach.properties")
public class FootBallCoachConfig {
	@Bean
	public DietService weightLossdiet() {
		return new WeightLossDiet();
	}

	@Bean
	@Scope("prototype")
	public Coach footBallCoach() {
		
		return new FoodBallCoach(weightLossdiet());
		
	}
}
