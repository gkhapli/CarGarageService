package com.cargarage.services.aspects;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CarLoggingAspect {

	private Logger logger = Logger.getLogger("CarLoggingAspect");

	@Around("execution(* *(..)) && @annotation(com.cargarage.services.aspects.Loggable)")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		logger.info("Starting: " + joinPoint.getSignature().getName() + " in class :"
				+ joinPoint.getSignature().getDeclaringTypeName() + "with args "
				+ Arrays.toString(joinPoint.getArgs()));

		Object result = joinPoint.proceed();

		logger.info("Exiting: " + joinPoint.getSignature().getName() + " in class :"
				+ joinPoint.getSignature().getDeclaringTypeName() + "with args "
				+ Arrays.toString(joinPoint.getArgs()));

		return result;
	}

}
