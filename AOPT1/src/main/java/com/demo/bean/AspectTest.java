package com.demo.bean;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;






public class AspectTest {

	
	public void beforeMethod(JoinPoint joinpoint){	
		System.out.println(Arrays.asList(joinpoint.getArgs()));
		System.out.println("调用方法之前");
	}
	
	public void afterMethod(){
		System.out.println("调用方法之后");
	}
	
}
