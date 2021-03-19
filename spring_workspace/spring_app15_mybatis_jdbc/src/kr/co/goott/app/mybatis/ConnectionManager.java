package kr.co.goott.app.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ConnectionManager {
       //  SqlSession ==== Connection
	
	static SqlSessionFactory factory;
	
//	static {} : ConnectionManager�� �޸𸮿� �ε��� �� ���� ����Ǵ� �κ�
//	           : new �ϱ� ���� ����Ǵ� ���
	
	
	static {
		try {
			Reader r = Resources.getResourceAsReader("resource/SqlMapConfig.xml");
			
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			
			factory = ssfb.build(r);
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}//static{} end
	
	public static SqlSessionFactory getFactory() {
		
		return factory;
		
		
	}
}
