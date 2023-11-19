package section9;

public class ThisPh {
	// this응용
	// this()
	String brand;	// 브랜드
	int series; // 시리즈
	String color;  // 색깔
	
	ThisPh(String brand, int series) {
		this.brand = brand;
		this.series = series;
	}
	
	ThisPh(String brand, int series, String color){
		// 중복 코드 = 척결 대상<-  this()로 해결
//		this.brand = brand;
//		this.series = series;
		
		this(brand, series);// 같은 클래스 안에 메서드 호출한거임
		this.color = color;
	}
}
