package phone;

public class Phone1 {
	// 라이브러리용
	
	// 필드
	String brand = "브랜드 없음";
	int series = 0;
	String color = "색상 없음";
	
	// 기본 생성자부터 매개변수가 3개인 생성자까지 선언

	
	// 생성자
	Phone1(){
	}
	Phone1(String brand){
		this.brand = brand;
	}
//	Phone1(String color){	//이건 아예 안된다.
//		this.color = color;	// 같은 타입의 매개변수  개수일때는 안됨 이름이 다르더라도 말이지..
//	}
	Phone1(int series){
		this.series = series;
	}

	Phone1(String brand , int series){
		this.brand = brand;
		this.series = series;
	}
	Phone1(int series, String brand){// 매개변수 순서가 다른건 가능하다
		this.brand = brand;
		this.series = series;
	}

	Phone1(String brand , int series, String color){
//		brand = brand;	//이렇게 하면 안된다. 양쪽
//		series = series;// 받아온값을 받아온 변수에 넣는다.
//		color = color;
		this.brand = brand;
		this.series = series;
		this.color = color;
	}
	
	//==================================================//
	
	// 메소드
	void phoneInfo() {
		System.out.println("브랜드: "+this.brand+", 시리즈 : "
	+this.series+", 컬러 : "+this.color);
	}
}
