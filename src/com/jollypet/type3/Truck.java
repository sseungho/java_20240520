package com.jollypet.type3;

public class Truck extends Car {

	// 부모 클래스의 추상 메소드는 반드시 오버라이딩해서 자식 클래스에서 사용 해야 함!!
	public void drive() { // Car 클래스의 추상 메소드 drive를 오버라이드 함
		System.out.println("트럭 운전");
	}

}
