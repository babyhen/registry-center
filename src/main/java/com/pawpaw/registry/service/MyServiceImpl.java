package com.pawpaw.registry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MyServiceImpl implements IMyService {

	@Autowired
	private AService aService;

	@Value("${PATHEXT}")
	private String pathExt;

	@Override
	public void print(int age, String name) {
		System.out.println(age);
		System.out.println(name);
		System.out.println(this.aService);

	}

	@Override
	public void print2() {
		System.out.println(this.pathExt);

	}

}
