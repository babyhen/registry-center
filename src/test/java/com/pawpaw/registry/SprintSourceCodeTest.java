package com.pawpaw.registry;

import java.util.Set;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;

public class SprintSourceCodeTest {

	@Test
	public void findCandidateComponents() {

		Set<BeanDefinition> set = new ClassPathScanningCandidateComponentProvider(true)
				.findCandidateComponents("com.pawpaw.registry.service");
		System.out.println(set.size());
		for (BeanDefinition bd : set) {
			System.out.println(bd);
		}
	}

	@Test
	public void scan() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(context);
		int size=scanner.scan("com.pawpaw.registry.service");
		System.out.println(size);
	}

}
