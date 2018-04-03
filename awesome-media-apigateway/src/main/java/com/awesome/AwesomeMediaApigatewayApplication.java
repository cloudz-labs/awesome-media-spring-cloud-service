package com.awesome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class AwesomeMediaApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwesomeMediaApigatewayApplication.class, args);
	}
}
