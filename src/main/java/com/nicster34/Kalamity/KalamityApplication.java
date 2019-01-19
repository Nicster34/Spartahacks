package com.nicster34.Kalamity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class KalamityApplication {

	public static void main(String[] args) {
		SpringApplication.run(KalamityApplication.class, args);
	}
	  @GetMapping("/")
	  public String hello() {
	    return "hello world!";
	  }

}

