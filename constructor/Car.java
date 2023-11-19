package constructor;

public class Car {
	// 라이브러리용
	
	// 필드
	String name;	// 자동차 이름
	String color;	// 색상
	String year;	// 연식
	int km;	// 주행거리
	
	// 생성자
	Car(String carName, String carColor, String carYear, int carKm){
		name = carName;
		color = carColor;
		year = carYear;
		km = carKm;
	}
	// 메서드
	void drive() {
		System.out.println("차의 이름 : "+ name+ ", 색상 :"+color+", 연식 : "
	+year+"년, 주행거리 :"+km+"Km");
	}
	
	
	
}
