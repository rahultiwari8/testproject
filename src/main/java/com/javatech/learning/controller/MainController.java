package com.javatech.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping("/")
	public String home()
	{
		System.out.println("This is home print");
		return "This is home for you!!";
	}
	

}
