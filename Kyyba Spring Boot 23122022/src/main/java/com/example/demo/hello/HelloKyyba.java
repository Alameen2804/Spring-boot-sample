package com.example.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloKyyba {

	@RequestMapping("/hello")
	public String SayHello()
	{
		return "Helloo!";
	}
}
