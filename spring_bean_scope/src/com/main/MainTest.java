package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.Coach;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("cricket",Coach.class);
		coach.display();
		Coach coach1 = context.getBean("cricket",Coach.class);
		System.out.println(coach.hashCode());
		System.out.println(coach1.hashCode());
	}

}
