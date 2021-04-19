package com.amit.spring.microservices.hystrixdshboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
@EnableEurekaClient
public class HystrixDshboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDshboardApplication.class, args);
	}

}
