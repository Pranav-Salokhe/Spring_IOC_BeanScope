package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.Coach;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("cricketcoach",Coach.class);
		coach.getDailyWorkout();
		
		Coach coach1 = context.getBean("tennicecoach",Coach.class);
		coach1.getDailyWorkout();
		

	}

}
