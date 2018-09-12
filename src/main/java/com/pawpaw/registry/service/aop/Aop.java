package com.pawpaw.registry.service.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.pawpaw.common.cache.EnableCacheAdvisor;

@Aspect
@Component
public class Aop {

	@Pointcut("execution(* com.pawpaw.registry.service.*.*(..))")
	public void allMethod() {

	}

	@Around("allMethod()")
	public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
		return new EnableCacheAdvisor(null, joinPoint).adviseEnableCache();
	}

}
