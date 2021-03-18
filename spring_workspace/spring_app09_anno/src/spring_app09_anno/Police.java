package spring_app09_anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Police implements Character {
	
	@Autowired			//DI 객체가 2개 이상이면 자동으로 의존주입이 안됨
							// 해결방법: 각각 Autowired로 묶던지, xml에서 하나만 남도록 컨테이너에서 삭제, @Qualifier로 지정
	@Qualifier("g")		//오토 와이어를 무기에 걸었으니까 무기가 어떤놈인지만 해두면 됨, g로 지정 해둠, 컨테이너에서 이 g가 Gun임을 지정
	Weapon w;			
	
	int hp;
	
	public Police() {
		this.hp = 100;
	}
	
//	public Police(Weapon w, int hp) {
//		this.w = w;
//		this.hp = hp;
//	}
	
	//setter/getter
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
		System.out.println("뚜벅뚜벅 순찰을 돌아요");
	}

	

	@Override
	public void eat(String it) {
		// TODO Auto-generated method stub
		System.out.println(it+"을 맛있게 먹어요");
	}

	@Override
	public void attack(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(obj +" 공격");
		w.use();
	}

	@Override
	public void get(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(obj+" 얻음");
		
	}

}
