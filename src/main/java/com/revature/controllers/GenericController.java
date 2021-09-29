package com.revature.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenericController {

	@GetMapping("hi")
	public String helloDevOps() {
		return "Hi Devops =)";
	}

	@GetMapping("anothertest")
	public String anotherTest(){
		return "Did this update?";
	}
}
