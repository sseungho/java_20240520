package com.jollypet.type3;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

	public void internetSearch() {
		System.out.println("인터넷 판매");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("터치 전원 켜기");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("터치 전원 끄기");

	}

	
}
