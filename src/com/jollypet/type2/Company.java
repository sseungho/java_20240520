package com.jollypet.type2;

public class Company {

	String name; // 필드
	int age; // 필드
	
	Human human1 = new Human(); // 필드
	Human human2 = new Human(); // 필드
	Human human3 = new Human(); // 필드
	Human human4; 
	
	public void  walkDog(Human human) {
		human.namePrint();
	}
}
