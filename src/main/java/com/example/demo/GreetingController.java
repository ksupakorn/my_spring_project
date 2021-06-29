package com.example.demo;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {



	
	@GetMapping("/greeting")
	public String greeting() {
		return "hello";
	}
	
	@GetMapping("/greeting2")
	public String greeting2() {
		return "hello22new22";
	}	
}
