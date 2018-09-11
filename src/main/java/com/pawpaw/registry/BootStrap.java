package com.pawpaw.registry;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pawpaw.registry.service.IMyService;

public class BootStrap {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.pawpaw.registry");
		context.refresh();
		IMyService service = context.getBean(IMyService.class);
		service.print2();
		
		
	}
}
