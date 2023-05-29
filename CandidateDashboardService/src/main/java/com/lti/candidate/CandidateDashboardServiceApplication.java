package com.lti.candidate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CandidateDashboardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CandidateDashboardServiceApplication.class, args);
	}

}
