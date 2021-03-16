package spring_app01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
//		HelloKr hk = new HelloKr();
//		hk.sayHello("홍길동");
		
		//위 자바 코드처럼 구동되도록 xml 설정 파일을 읽어들이기
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app.xml"));	//외부 파일 가져오므로 IO
		
		
		Object obj = factory.getBean("hk");	//xml bean의 id로 찾아옴, Object임
		Hello h = (Hello)obj;	//Hello로 사용하기 위해 캐스팅
		
		h.sayHello("홍길동");
		
		
		Object obj2 = factory.getBean("hj");
		Hello h2 = (Hello)obj2;
		
		h2.sayHello("日");
		
		
		Object obj3 = factory.getBean("hc");
		Hello h3 = (Hello)obj3;
		
		h3.sayHello("中");
	}
}
