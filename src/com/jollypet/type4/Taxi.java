package com.jollypet.type4;

public class Taxi implements Car {

	@Override
	public void forwardDrive() {
		// TODO Auto-generated method stub
		System.out.println("앞으로 가기");
	}

	@Override
	public void backwardDrive() {
		// TODO Auto-generated method stub
		System.out.println("뒤로 가기");
	}

	@Override
	public void stopDrive() {
		// TODO Auto-generated method stub
		System.out.println("정지");
	}
	

}
