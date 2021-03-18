package spring_app11_Javaconf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConf.class);
		
		Monitor mt = context.getBean("sm", Monitor.class);
		
		mt.showMonitor();
	}
}
