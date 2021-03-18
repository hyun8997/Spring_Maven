package spring_app11_Javaconf;

import java.util.concurrent.Semaphore;

public class SystemMonitor implements Monitor {
	
	Sender sender;
	
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	
	
	@Override
	public void showMonitor() {
		// TODO Auto-generated method stub
		if(sender != null) {
			sender.show();
		}else {
			System.out.println("sender is null");
		}
		
	}

}
