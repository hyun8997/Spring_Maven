package spring_app02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		
		// DI (Dependency Injection) : 의존관계에 있어서 xml에 있는 정보를 스프링 프레임워크가 run time시 호출해서 동작
		Object obj = factory.getBean("b");
		
//		Beverage b = (Beverage)obj;
//		b.drink("홍길동");
		
		//유관순님이 초코우유를 홀짝홀짝 마셔요 - 출력이 되도록 CoffeeImple 수정하기
//		CoffeeImple ci = new CoffeeImple("초코우유");
//		ci.drink("유관순");
		
		Beverage b = (Beverage)obj;
		b.drink("유관순");
		
		
		Object obj2 = factory.getBean("b2");
		Beverage b2 = (Beverage)obj2;
		b2.drink("갑돌이");
		
		
		
		Object obj3 = factory.getBean("b");
		Object obj4 = factory.getBean("b");
		//ref 주소가 같음 : 스프링은 bean 관리를 singletone으로 하고있음을 알 수 있음!
		System.out.println("obj3 : "+obj3);
		System.out.println("obj4 : "+obj4);
		
		
		
		
		
		
		
		
		
	}
}
