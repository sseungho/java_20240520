package com.jollypet.type4;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Car car = new Car(); // 인터페이스는 new 연산자로 객체 생성 불가
		
		Taxi taxi = new Taxi();
		
		Car car; // 인터페이스 객체 선언
		
		car = taxi;
		
		car.backwardDrive();
	}

}
