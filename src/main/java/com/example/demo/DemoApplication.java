package com.example.demo;


import com.example.demo.models.Client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =
		new ClassPathXmlApplicationContext("spring-beans.xml");

		Client client = (Client) context.getBean("client");
        System.out.println(client.toString());

	}

}
