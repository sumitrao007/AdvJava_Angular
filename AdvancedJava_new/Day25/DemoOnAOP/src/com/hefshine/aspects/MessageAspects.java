package com.hefshine.aspects;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MessageAspects {
	
	@After("execution (public void deposits(..))")
	public void SendSMS() {
		System.out.println("SMS Send to the Client......");
	}
	
	
	@After("execution (public void deposits1(..))")
	public void SendSMS(JoinPoint pt) {
		System.out.println("SMS Send to the Client......");
		
		System.out.println("Joint Point on method is "+pt.getSignature());
		System.out.println("Joint Point on method Name is "+pt.getSignature().getName());
		System.out.println("Amount is  "+Arrays.toString(pt.getArgs()));
		
	}
	
//	@Before("execution (public void withdraw(..))")
//	public void pinValid() {
//		System.out.println("...Enter the Pin U R in pinValid() Method.....");
//	}
	
	
//	@Before("execution (* com.hefshine.bean.Account.*(..))")
//	public void pinValid() {
//		System.out.println("...Enter the Pin U R in pinValid() Method.....");
//	}
	
	
//	@Around("execution (* com.hefshine.bean.Account.*(..))")
	public void AroundmyMEthod(ProceedingJoinPoint p) {
		
		System.out.println("========Before Method Pin Valid Logic=====");
		
		try {
			p.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Send sms logic
		
		System.out.println("========After Method Send SMS Logic=====");
		
	}
	
//	@AfterReturning("execution (public String com.hefshine.bean.Account.fundTransfer(..))")
//	public void ReturnMessage() {
//		
//		System.out.println("-----------After Returning Message----------------------");
//		
//		
//	}
	
	
	@AfterReturning(pointcut = "execution (public String com.hefshine.bean.Account.fundTransfer(..))",
			returning = "myresult")
	public void ReturnMessage(Object myresult) {
		
		System.out.println("-----------After Returning Message----------------------");
		System.out.println("Return Message is "+myresult);
		System.out.println("------------------------------------------------------");
		
		
	}
	
	@AfterThrowing(pointcut = "execution (public void com.hefshine.bean.Account.ChangePin())",throwing = "ex")
	public void ThrowingException(Exception ex) {
		System.out.println("******************************************");
		System.out.println("Exception is "+ex);
		System.out.println("******************************************");
	}
	
	
	
	
}
