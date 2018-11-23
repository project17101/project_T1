package com.demo.bean;

import org.springframework.stereotype.Component;

@Component


public class AopTestImpl implements AopTestInterface {

	@Override
	public int add(int i, int j) {	
		
		System.out.println("===========正在执行方法===========");
		
		return i+j;
	}

	@Override
	public int sub(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println("i-j="+(i-j));
		return i-j;
	}

	@Override
	public int mul(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
	}

	@Override
	public int div(int i, int j) {
		// TODO Auto-generated method stub
		return i/j;
	}

}
