package com.devopsbuddy.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldController {

	@RequestMapping()
	public String helloWorld() {
		return "index";
	}
}
