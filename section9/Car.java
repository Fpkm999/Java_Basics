package section9;

public class Car {
	// 라이브러리용
	// 기본 생성자
	Car() {// 생성자. 위치는 상관 없으나 클래스명과 동일하게 해야됨
//		System.out.println("하이");
	}	//객체를 생성할 때 호출됨 매개변수없는 아무것도 없는게 기본 생성자

	// 생성자
	Car(String carName) {
		name = carName;
	}// 생성할 수 있는게 2개임 기본이랑 이거
	
	
	// 필드
	String name;	// 자동차 이름
	
	// 메서드
	void drive() {// 주행하는 것을 출력하는 메서드
		System.out.println(name + " 자동차가 주행합니다.");
	}
	
	
	
	
}
