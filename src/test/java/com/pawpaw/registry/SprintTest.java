package com.pawpaw.registry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pawpaw.registry.service.IMyService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootStrap.class)
public class SprintTest {

  
	
	@Autowired
	private  IMyService s;
	
	
	@Test
	public void m() {
		this.s.print2();
	}
	
	
	
}
