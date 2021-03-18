package spring_app11_Javaconf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConf {
	
	@Bean
	public Sender sender() {
		Sender sender = new Sender();
		return sender;
	}
	
	@Bean(name = "sm")
	public SystemMonitor sysMoniter() {
		SystemMonitor sysMo = new SystemMonitor();
		sysMo.setSender(sender());
		
		return sysMo;
	}
}
