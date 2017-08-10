package com.hibernate.tutorial.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	
	@Around("execution(* com.hibernate.tutorial.dao.*.*(..))")
	public void logAroundDAO(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("********[method-start][" + joinPoint.getSignature().getDeclaringType().getSimpleName() + "." + joinPoint.getSignature().getName() + "]");
		joinPoint.proceed();
		System.out.println("********[method-end][" + joinPoint.getSignature().getDeclaringType().getSimpleName() + "." + joinPoint.getSignature().getName() + "]");
	}

}
