package com.apress.ch04.sample01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.actuate.trace.http.*;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OrderProcessingApp {

	public static void main(String[] args) {
		SpringApplication.run(OrderProcessingApp.class, args);

	}

	 @Bean
	 public HttpTraceRepository httpTraceRepository() {
	 	return new InMemoryHttpTraceRepository();
	 }
}
