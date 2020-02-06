package com.restassured.example.restassureddemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EUCAspect {
	
//	@Pointcut(value = "execution(* *.*(..))")
   
	/*
	 * @Pointcut(value = "execution(* *.*(..))") public void allMethods() { //
	 * LOGGER.debug("Inside all methods"); System.out.println("===="); }
	 * 
	 * @Before("allMethods() && @annotation(EucLogger)") public void
	 * startAProcess(JoinPoint pjp) throws Throwable { //Do something MDC.put("val",
	 * "02");
	 * System.out.println("====");System.out.println("====");System.out.println(
	 * "===="); }
	 */
    
	/*
	 * @Around("execution(* *.*(..)) && @annotation(com.restassured.example.restassureddemo.EucLogger)"
	 * ) public void check(ProceedingJoinPoint p) { MDC.put("val", "02");
	 * System.out.println("====");
	 * 
	 * }
	 */
    
    
	/*
	 * @Pointcut("within(com.restassured.example.restassureddemo.*) && @annotation(com.restassured.example.restassureddemo.EucLogger)"
	 * ) public void loggableMethods() { }
	 */
    
    @Around("execution(* *.*(..)) && @annotation(com.restassured.example.restassureddemo.EucLogger)")
    public void logMethod(ProceedingJoinPoint  point) throws Throwable {
    	long start = System.currentTimeMillis();
    	 String methodName = point.getSignature().getName();
    	MDC.put("methodName",  methodName);
              	Object result = point.proceed();
       
        System.out.println("EUC logger"+Long.toString(System.currentTimeMillis()-start));
        
      //  logger.info("Executing method: " + methodName);
    }
    
    
}