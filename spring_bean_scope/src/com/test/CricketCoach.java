package com.test;

import com.service.Coach;

public class CricketCoach implements Coach  {

	private String name;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void display() {
		System.out.println("This is a CricketCoach class "+name);
		
	}

}
