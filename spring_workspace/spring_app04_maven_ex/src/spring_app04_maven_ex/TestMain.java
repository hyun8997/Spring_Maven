package spring_app04_maven_ex;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		
		Beverage b = factory.getBean("ci", Beverage.class);
		b.drink("유관순");
		
		Beverage b2 = factory.getBean("mci", Beverage.class);
		b2.drink("홍길동");
	}
}
