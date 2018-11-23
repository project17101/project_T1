package com.demo.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.demo.bean.AopTestInterface;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AopTestInterface ati = ac.getBean(AopTestInterface.class);
		int result = ati.sub(10, 4);
		//ati.sub(10, 4);
		System.out.println("result:"+result);
	}
}
