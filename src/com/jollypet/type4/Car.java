package com.jollypet.type4;

public interface Car { // 언터페이스 선언
	// 인터페이스 내에서는 추상 메소드만 선언 가능함.
	
	String modelName = "SantaFe"; // 상수만 선언 가능
	
	public void forwardDrive(); // 일반 메소드로 선언해도 추상 메소드로 취급함.
	public void backwardDrive();
	public void stopDrive();


}
