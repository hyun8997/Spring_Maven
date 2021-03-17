package spring_app05_maven;

import java.sql.Connection;

public class OracleDAO implements CommonDAO {

	@Override
	public Connection connect() {
		// TODO Auto-generated method stub
		return OracleConnection.getInstance().getConnection();
	}

	@Override
	public void selectAll() {
		// TODO Auto-generated method stub
		
	}

}
