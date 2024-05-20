package com.jollypet.type5;

public class DaoExample {

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delect();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

}
