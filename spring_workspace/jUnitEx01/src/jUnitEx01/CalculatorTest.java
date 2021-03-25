package jUnitEx01;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		double result = c.sum(10, 20);
		
//		if(result!=30) {
////			syse로 sysout처럼 에러출력
//			System.err.println("error : "+result);	//error메세지 출력
//		}		
		
		result = c.sum(1.1, 2);
		
//		if(result!=3.1) {
//			System.err.println("error : "+result);
//		}
		
		result = c.sum(1.1, -2);
		
//		if(result != -0.9) {	//실슈는 완벽한 정확도를 보장하지 않아서 -0.9가 아닌 -0.8999999로써, 에러임
//			System.err.println("error : "+result);
//		}
		
		if(result <= -0.9 && result >= -0.89) {	  //위에서 테스트 결과를 바탕으로 범주로 설정
			System.err.println("error : "+result);
		}
		
		
	}
	
	
}
