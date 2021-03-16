package spring_app02;

public class MachineCoffee implements Beverage {

	String product;
	
	public MachineCoffee() {
		this.product = "테스트캡슐";
	}

	public MachineCoffee(String product) {
		this.product = product;
	}

	@Override
	public void drink(String name) {
		System.out.println(name + "님이 "+product+"을/를 맛있게 먹어요");

	}

}
