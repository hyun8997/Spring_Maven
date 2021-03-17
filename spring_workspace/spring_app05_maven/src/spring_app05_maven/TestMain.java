package spring_app05_maven;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
//		MysqlDAO mdao = new MysqlDAO();
//		mdao.connect();
		
//		OracleDAO odao = new OracleDAO();
//		odao.connect();
		
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/connection.xml"));
		
		CommonDAO conn = factory.getBean("oc", CommonDAO.class);
		conn.connect();
		conn.selectAll();
		
	}
}
