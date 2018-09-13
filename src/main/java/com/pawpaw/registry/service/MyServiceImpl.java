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
	@Autowired
	private BService bService;

	@Value("${PATHEXT}")
	private String pathExt;

	@Override
	public void print() {
		System.out.println(this.pathExt);

	}

}
