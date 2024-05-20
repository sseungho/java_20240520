package com.jollypet.type3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Car car = new Car(); // 추상 클래스는 객체를 만들 수 없음
		// -> 추상 클래스 -> 객체 기본 설계도 역할만 한다. -> 상속 용도로만 사용
		
		// Phone phone = new Phone(); // 추상 클래스 객체 선언 불가
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.internetSearch();
		smartPhone.turnOff();
		smartPhone.turnOn();
	}

}
