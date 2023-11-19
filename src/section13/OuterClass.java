package section13;

public class OuterClass {	// 외부 클래스
	private String name;	// 인스턴스 멤버
	//private는 내부클래스에서도 접근 못함 ㅅㄱ. 무조건 해당클래스만됨
	// 인스턴스 내부 클래스
	// 외부 클래스의 멤버 변수와 같은 위치에 선언한다.
	public class Inner {	// 인스턴스 내부 클래스
		
	}
	
	
	//================================================//
	////////////////////////////////
	// 정적 내부 클래스 ////////////////
	
	public int number1 = 1; // 인스턴스 멤버 변수
	public static int number2 = 2; // 정적 변수
	
	public static class Inner2 {
		// 정적 클래스 안에는 정적 변수 또는 정적 메서드만 사용 가능
		public void add() {
//			System.out.println(number1 +number2);
			// number1은 정적변수가 아니기 때문에 사용못함
			// 오류를 지우지말자. 보고 보자.
		}
	}
	
	
	
	// ==================================================
	
	public void print() {
		class Inner {
			
		}
		Inner inner = new Inner(); // 메서드 내에서만 사용가능하다.
	}
}
