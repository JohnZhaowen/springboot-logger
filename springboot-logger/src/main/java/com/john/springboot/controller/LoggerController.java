package com.john.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggerController {
	
	@RequestMapping("/logger1")
	public String loggerTest() {
		
		return "logger1";
	}
}
