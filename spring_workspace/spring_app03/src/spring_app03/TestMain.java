package spring_app03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/printer.xml"));
		
		Printer p = factory.getBean("lp", Printer.class);	//id, 뭐로 형변환 할지 동시에 처리
		p.printing("오늘은 화요일");
		
		System.out.println("-------------------------------------------------");
		
		//DotPrinter로 출력
		// 출력
		// DotPrinter 예열 중...
		// msg : 내일은 수요일
		Printer p2 = factory.getBean("dp", Printer.class);
		p2.printing("내일은 수요일");
		
		
		
	}
}
