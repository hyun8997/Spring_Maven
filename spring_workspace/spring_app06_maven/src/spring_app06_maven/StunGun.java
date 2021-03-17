package spring_app06_maven;

public class StunGun implements Weapon{
	int bullet;
	
	public StunGun() {
		this.bullet = 1;
	}
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		if(bullet>0) {
			System.out.println("지지직!");
			bullet=0;
		}
	}

	@Override
	public void reuse() {
		// TODO Auto-generated method stub
		System.out.println("충전중...");
		bullet=1;
	}

	@Override
	public void drop() {
		// TODO Auto-generated method stub
		System.out.println("아놔....");
		bullet=0;
	}
	
}
