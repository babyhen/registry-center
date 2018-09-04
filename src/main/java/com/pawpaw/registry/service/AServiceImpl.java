package com.pawpaw.registry.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AServiceImpl implements IAService{

	@Value("${str}")
	private String s;
	
	@Override
	public void print() {
		System.out.println(this.s);
		
	}
 
}
