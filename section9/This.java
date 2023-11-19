package section9;

public class This {
	private String brand;	// 브랜드
	int series; // 시리즈
	String color;  // 색깔
	
	This(String brand, int series, String color){
		this.brand = brand;
		this.series = series;
		this.color = color;
	}

	// brand메소드드를 getter를 이용해보자

	String getBrand() {
		return brand;
	}
	void setBrand(String brand){
		this.brand = brand;
		// 필드 	   = 매개변수;
	}
}
