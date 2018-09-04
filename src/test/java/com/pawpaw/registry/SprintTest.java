package com.pawpaw.registry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.core.ResolvableType;

public class SprintTest {
	
	Map<String,List<String>> m=new HashMap<>();
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		
		ResolvableType rt=ResolvableType.forField(SprintTest.class.getDeclaredField("m"));
		
		System.out.println(rt.getGenerics().length);
		System.out.println(rt.getGenerics()[0].getType());
		System.out.println(rt.getGenerics()[1].getType());
	}
	
	
}
