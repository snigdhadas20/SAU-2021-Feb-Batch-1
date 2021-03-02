package com.sau.assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sau.assignment2.service.BusinessService;

public class App {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean2.xml");

		BusinessService businessService = (BusinessService) ctx.getBean("businessService");

		businessService.getLogistics().setName("New Logistics");
		System.out.println(businessService.getLogistics().getName());

	}
}