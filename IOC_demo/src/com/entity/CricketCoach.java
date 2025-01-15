package com.entity;

import com.service.Coach;

public class CricketCoach implements Coach {

	@Override
	public void getDailyWorkout() {
		System.out.println("This is a cricket coach class...");
		
	}
	
}
