package spring_app01;

public class HelloKr implements Hello {

	@Override
	public void sayHello(String name) {
		System.out.println(name+" 님 환영합니다");
		
	}

}
