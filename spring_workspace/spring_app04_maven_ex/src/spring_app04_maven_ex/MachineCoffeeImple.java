package spring_app04_maven_ex;

public class MachineCoffeeImple implements Beverage {
	
	String product;

	public MachineCoffeeImple() {
		this.product = "테스트 캡슐";
	}

	public MachineCoffeeImple(String product) {
		this.product = product;
	}

	@Override
	public void drink(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + "님이 "+product+"을/를 맛있게 먹어요");
	}

}
