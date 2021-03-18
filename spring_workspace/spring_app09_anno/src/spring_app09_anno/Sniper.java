package spring_app09_anno;

public class Sniper implements Character {
	
	Weapon w;
	Gun g;
	StunGun s;
	
	int hp;
	
	public Sniper() {
		this.hp=100;
	}
	
	public Sniper(Weapon w, int hp) {
		this.w=w;
		this.hp=hp;
	}
	
	
	public Weapon getW() {
		return w;
	}

	public void setW(Weapon w) {
		this.w = w;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("walk");
	}

	@Override
	public void eat(String it) {
		// TODO Auto-generated method stub
		System.out.println("eat");
	}

	@Override
	public void attack(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(obj+" shoot");
	}

	@Override
	public void get(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(obj+" get");
	}
	
}
