package com.jollypet.type2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company company = new Company();
		company.name = "Kurt Cobain";
		
		company.human1 =  new Student();	// 업캐스팅 
		company.human2 =  new Worker(); 	// 업캐스팅
		company.human3 =  new Soldier(); 	// 업캐스팅
		Human human =  new Worker();

	company.walkDog(human);
	
	}

}
