package spring_app07_anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		
		//스프링 컨테이너를 통한 메세지 출력
		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");  //root가 src고 그 밑에 바로 app.xml이 있으므로
		
		GreetingImple gi = context.getBean("gi", GreetingImple.class);
		gi.printMsg();
		
		
		
	}
}
