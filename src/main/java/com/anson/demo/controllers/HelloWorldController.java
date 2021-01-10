package com.anson.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController
public class HelloWorldController {
	@Value("${optional1}")
	String optional1;

	@Resource
	ApplicationArguments applicationArguments;

	@GetMapping("/test")
	public Object test(){
		HashMap<String, String > a = new HashMap<>();
		//option1
		a.put("optional1", optional1);
		a.put("systemProperty1", System.getProperty("systemProperty1"));
		a.put("applicationArguments.getNonOptionArgs", applicationArguments.getNonOptionArgs().toString());
		a.put("applicationArguments.getOptionNames", applicationArguments.getOptionNames().toString());
		applicationArguments.getOptionNames().forEach(name -> {
			a.put("applicationArguments.getSourceArgs:"+name, applicationArguments.getOptionValues(name).toString());
		});
		a.put("applicationArguments.getSourceArgs", applicationArguments.getSourceArgs().toString());
		return a;
	}
	
}
