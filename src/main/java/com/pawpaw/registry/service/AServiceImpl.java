package com.pawpaw.registry.service;

import org.springframework.stereotype.Service;

@Service
public class AServiceImpl implements AService {

	@Override
	public void print() {
		System.out.println("A");

	}

}
