package com.pawpaw.registry;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pawpaw.registry.service.IMyService;

public class BootStrap {
	public static void main(String[] args) {
		// SpringApplication.run(BootStrap.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		System.out.println(context);
		context.scan("com.pawpaw.registry");
		context.refresh();
		IMyService s = context.getBean(IMyService.class);
		s.print();

	}
}
