package com.kalyan.learnspringboot.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnspringbootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LearnspringbootApplication.class, args);
		
		for(String name: context.getBeanDefinitionNames()) {
			
			System.out.println(name);
		}
		
		System.out.println("COUNT IS"+context.getBeanDefinitionCount());
	}

}
