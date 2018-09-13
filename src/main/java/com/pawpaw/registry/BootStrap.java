package com.pawpaw.registry;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BootStrap {
	public static void main(String[] args) {
		new SpringApplicationBuilder(BootStrap.class).run(args);
	}
}
