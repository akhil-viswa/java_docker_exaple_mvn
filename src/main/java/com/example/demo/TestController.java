package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/hello")
	public String say() {
		return "Hello bugfix";
	}

	@GetMapping("help")
	public String nothing(){
		return  "help";
	}
}
