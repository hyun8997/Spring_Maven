package spring_app04_maven;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app.xml"));	
		//spring 3에는 줄 안그어지는데 5는 그어짐
		//중복된다는 의미, 나중에 사라질 것임
		
		Message msg = factory.getBean("g",Message.class);
		
		msg.sayHello("쉬는 시간입니다.");
	}
}
