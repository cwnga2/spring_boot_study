package com.example.demo;

import org.example.AnsonLib;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		new AnsonLib();

		SpringApplication.run(DemoApplication.class, args);
	}

}
