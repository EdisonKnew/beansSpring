package com.example.demo;

import com.example.demo.models.Company;
import com.example.demo.models.FoodPantry;
import com.example.demo.services.Service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =
		new ClassPathXmlApplicationContext("spring-beans.xml");

		Service service = (Service) context.getBean("service");

		service.setMessage("Super message");
		System.out.println(service);
		service = (Service) context.getBean("service");
		System.out.println(service);

	}

}
