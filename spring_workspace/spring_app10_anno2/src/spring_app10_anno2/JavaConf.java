package spring_app10_anno2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*xml파일이 하는 컨테이너 역할을 대신할거임*/
@Configuration
public class JavaConf {
	
	@Bean
	public PhoneOS phoneOs() {
		PhoneOS po = new PhoneOS();
		po.setName("아이폰12");
		po.setVersion("ios 14");
		
		return po;
	}
	
	@Bean(name = "p")		 /* 반드시 하나는 이름이 있어야 한다. */
	public SmartPhone smartPhone() {
		SmartPhone sp = new SmartPhone();
		sp.setOs(phoneOs());
		
		return sp;
	}
	
}
