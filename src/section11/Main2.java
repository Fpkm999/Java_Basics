package section11;


public class Main2 {
	public static void main(String[] args) {

	Car2 car2 = new Bus2();
	
	// 자식 클래스가 개별적으로 추가한 멤버는 사용이 불가능하다
	// car2.name
	// car2.stop() 둘다 불가능함
	
	// 오버라이딩한 메서드를 호출
	car2.ride();
	
	}
}
