package org.example;

import org.example.service.UserService;
import org.example.service.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserServiceImpl.class);
		UserService userService = (UserService)context.getBean("userServiceImpl");
		System.out.println("userService = " + userService);
	}

}

