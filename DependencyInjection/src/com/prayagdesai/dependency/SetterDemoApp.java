package com.prayagdesai.dependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring configuaion file
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
				// retrive the bean from the spring container
				CricketCoach theCoach = context.getBean("my1", CricketCoach.class); // Coach.class is the actual name of the inteface 
				// call mehthods on the bean
				System.out.println(theCoach.getFortune());
				// call the new values 
				System.out.println(theCoach.getName());
				// close the bean
				context.close();

	}

}
