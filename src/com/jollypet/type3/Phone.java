package com.jollypet.type3;

public abstract class Phone {
	
	public String owner;

	public Phone(String owner) {
		super();
		this.owner = owner;
	}
	
	public abstract void turnOn(); // 추상 메소드
	
	public abstract void turnOff(); // 추상 메소드

}
