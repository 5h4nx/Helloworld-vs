package com.example.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldApplicationController {

	



	
	@RequestMapping("/")
	
	 public String home() {
        return "Hello World!";
    }

    

}

