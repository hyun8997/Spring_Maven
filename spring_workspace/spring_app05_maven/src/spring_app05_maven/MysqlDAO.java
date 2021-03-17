package spring_app05_maven;

import java.sql.Connection;

public class MysqlDAO implements CommonDAO {
	public MysqlDAO() {}

	@Override
	public Connection connect() {
		return MyConnection.getInstance().getConnection();
	}

	@Override
	public void selectAll() {
		// TODO Auto-generated method stub
		
	}



	
}
