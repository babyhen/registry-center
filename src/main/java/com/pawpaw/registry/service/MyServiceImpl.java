package com.pawpaw.registry.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements IMyService {

	@Value("${PATHEXT}")
	private String pathExt;

	@Override
	public void print(int age, String name) {
		System.out.println(age);
		System.out.println(name);

	}

	@Override
	public void print2() {
		System.out.println(this.pathExt);

	}

}
