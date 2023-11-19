package section13;

public class Calculator { // 외부 클래스

	// 인스턴스 멤버
	public int number1;
	public int number2;
	
	// 생성자로 필드에 값 초기화
	public Calculator(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
		
	}
	public class Calc {// 인스턴스 내부 클래스
		public int add() {
			return number1 + number2;
		}
	}
	
	
}
