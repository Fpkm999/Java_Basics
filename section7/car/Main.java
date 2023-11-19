package section7.car;

public class Main {

	public static void main(String[] args) {
		// 실행용 메인 메서드
		
		// 객체 생성 자동차 4개
		// 자동차의 종류, 필드에 값 넣기
		// 자동차 주행
		// 연식이 2015년 이고 색상이 빨간색인 주행거리
		// 16000KM 그랜져가 주행합니다.
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		Car car4 = new Car();
		
		// 자동차1
		car1.name = "테슬라V";
		car1.color = "파란색";
		car1.year = "2011년";
		car1.km = 140000;
		
		// 자동차2
		car2.name = "아이오닉VI";
		car2.color = "그레이";
		car2.year = "2022년";
		car2.km = 200000;
		
		// 자동차3
		car3.name = "아우디5";
		car3.color = "화이트블루";
		car3.year = "2023년";
		car3.km = 300000;
		
		// 자동차4
		car4.name = "티코";
		car4.color = "노란색";
		car4.year = "2000년";
		car4.km = 8000;
				
		car1.drive();
		car2.drive();
		car3.drive();
		car4.drive();
	}
}
