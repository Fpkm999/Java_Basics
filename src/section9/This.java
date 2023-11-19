package section9;

public class This {
	String brand;	// 브랜드
	int series; // 시리즈
	String color;  // 색깔
	
	This(String brand, int series, String color){
		this.brand = brand;
		this.series = series;
		this.color = color;
	}
	// brand getter
	String getBrand() {
		return brand;
	}
	// brand setter
	void setBrand(String brand) {
		this.brand = brand;
		// 필드     =  매개변수;
	}
}
