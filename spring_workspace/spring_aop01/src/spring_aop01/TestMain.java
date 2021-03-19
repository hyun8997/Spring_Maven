package spring_aop01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("app.xml");
		
		CustomerService cs = context.getBean("execute", CustomerService.class);
		cs.printName();	//이거 전에 하이잭 어드바이스가 동작하도록 할 것임!
								//끼어드는게 하이잭, 수행은 어드바이스
		cs.printEmail();
	}
}
