package com.empapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//Empappv1Application how it works?
@SpringBootApplication
public class Empappv1Application {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(Empappv1Application.class, args);
//		String[] beans= ctx.getBeanDefinitionNames();
//		for(String beanName: beans){
//			System.out.println(beanName);
//		}
	}

}
