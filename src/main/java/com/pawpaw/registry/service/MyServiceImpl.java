package com.pawpaw.registry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements IMyService {

	@Autowired
	private IAService aService;

	@Override
	public void print() {
		this.aService.print();

	}

}
