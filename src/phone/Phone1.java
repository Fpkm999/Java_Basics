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
	Phone1(String pbrand){
		brand = pbrand;
	}
//	Phone1(String pcolor){	//이건 아예 안된다.
//		color = pcolor;	// 같은 타입의 매개변수 개수일때는 안됨 
//	}
	Phone1(int pseries){
		series = pseries;
	}

	Phone1(String pbrand , int pseries){
		brand = pbrand;
		series = pseries;
	}
	Phone1(int pseries, String pbrand){// 매개변수 순서가 다른건 가능하다
		brand = pbrand;
		series = pseries;
	}
	
//	Phone1(String pbrand , int pseries, String pcolor){
//		brand = pbrand;
//		series = pseries;
//		color = pcolor;
//	}
	Phone1(String brand , int series, String color){
//		brand = brand;	//이렇게 하면 안된다. 양쪽
//		series = series;// 받아온값을 받아온 변수에 넣는다.
//		color = color;
		this.brand = brand;
		this.series = series;
		this.color = color;
	}
	
	
	
	// 메소드
	void phoneInfo() {
		System.out.println("브랜드: "+brand+", 시리즈 : "
	+series+", 컬러 : "+color);
	}
}
