package com.javatech.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.javatech.learning.dao.UserRepository;
import com.javatech.learning.entity.User;

@SpringBootApplication
public class Springdemo1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Springdemo1Application.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		User user = new User();
		user.setName("Rahul");
		user.setCity("Pune");
		user.setStatus("Java Programer");
		
		User user1 = userRepository.save(user);
		
		System.out.println(user1);
	}

}
