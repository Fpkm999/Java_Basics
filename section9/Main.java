package section9;

public class Main {
	// String[] args = 매개변수.
	public static void main(String[] args) {
		// 실행용 클래스. 메인 메서드
		// 기본 생성자를 이용한 방식
		Car car = new Car();	// 객체 생성
		
		car.name = "그랜저";	// nmae 필드 초기화
	
		car.drive();
		
		System.out.println("==========================");
		
		// 생성자 오버로딩
		// 필드에 값을 초기화하는 생성자 호출
		Car car2 = new Car("SM99");	// 객체를 생성함과 동시에 객체를 초기화.
		
		car2.drive();
		
		
		System.out.println("==========================");
		
		Car2 car3 = new Car2("투싼", 34353);
		
		car3.drive();
		
		
		System.out.println("==========================");
		// 생성자 오버로딩
		//생성자를 이용해 자동차 만들기
		Phone p1 = new Phone("galaxy",23, "Cream");
		Phone p2 = new Phone("iphone", 13);//Phone라는 객체에 매개변수3개를 만들었는데 2개만 써서 오류뜸
		
		System.out.println(p1.brand);
		System.out.println(p1.series);
		System.out.println(p1.color);

		System.out.println("==========================");


		p1.phoneInfo();
		p2.phoneInfo();
//		galaxy 23 Cream
//		iphone 13 검정색
		
		
	}

}
