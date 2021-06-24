package com.example.demo;

import com.example.demo.models.Company;
import com.example.demo.models.Customer;
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

		Customer customer = (Customer) context.getBean("customer");

		System.out.println(customer);

	}

}
