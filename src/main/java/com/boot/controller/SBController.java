package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SBController {

	@RequestMapping("/")
	public String startMethod(){
		return "Hello";
	}
}
