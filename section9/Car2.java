package section9;

public class Car2 {
	// 라이브러리용

	// 생성자
	Car2(String carName, int carKm) {
		name = carName;
		km = carKm;
	}

	// 필드
	String name; // 자동차 이름
	int km; // 주행  거리
	
	// 메서드
	// km, 자동차 이름을 넣어서 주행 출력하는 메서드
	void drive() {
		System.out.println("주행거리 : "+ km+", 자동차 이름 : "+ name);
	}
}
