package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IDubboComsumerService;

@RestController
public class TestController {
	
	@Autowired
	private IDubboComsumerService dubboComsumerService;
	
	@RequestMapping("/test")
	private String test() {
		dubboComsumerService.test();
		return "comsumer";
	}
	
}
