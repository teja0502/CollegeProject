package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BootCollegeProject01EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootCollegeProject01EurekaServerApplication.class, args);
	}

}
