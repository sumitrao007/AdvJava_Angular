package com.hefshine.aspects;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
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
	
	
	@Around("execution (* com.hefshine.bean.Account.*(..))")
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
	
	
	
	
}
