package car;

public class Car {
	// 라이브러리용 클래스
	// 자동차 설계도
	
	
	// 필드
	String name; //자동차 이름
	String color; // 자동차 색상
	String year; // 연식
	int km; //주행거리
	
	// 메서드
	void drive() {	// 주행하는 기능을 담당
		System.out.println("연식이 "+year+" 이고 "+"색상이 "+color+"인 주행거리 "+year+"KM "+name+"가 주행합니다.");

	}
}
