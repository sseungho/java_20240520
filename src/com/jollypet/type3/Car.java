package com.jollypet.type3;

public abstract class Car { // 추상 클래스

	String model;
	String color;
	int carAge;
	
	public abstract void drive(); // 추상 메소드는 내용 body 가 없음. 선언부만 존재
	
	public void horn() {
		System.out.println("빵빵");	

	}
}
