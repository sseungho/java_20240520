package com.jollypet.type;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat = new Cat(); // cat 자식 객체 선언
		
		Animal animal = new Animal(); // animal 부모 객체 선언
		
		int a=1;
		byte b = 10;
		a=b;
		// b=a; // 에러 발생!
		double c =1.0;
		int d = 10;
		// d = c;  
		
		
		animal = cat; // 업캐스팅!
		// cat = animal; // 에러 발생!
		cat = (Cat) animal; // animal을 임시 형변환해서 cat 에 대입 가능, 다운캐스팅!  
		
		
		Dog dog = new Dog();
		Turtle turtle = new Turtle();
		Cat cat1 = new Cat();
		
		Animal animal1 = new Animal();
		
		animal1 = new Dog(); // 업캐스팅
		animal1 = new Turtle();
		animal1 = new Cat();
		

	}

}
