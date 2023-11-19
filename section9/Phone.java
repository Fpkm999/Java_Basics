package section9;

public class Phone {
	// 필드
	String brand; // 휴대폰 브랜드
	int series; // 휴대폰 시리즈
	String color = "검정색";
	
	
	
	// 오버로딩
	// 매개변수의 타입이나 개수를 다르게 해서
	// 같은 이름의 메서드를 중복하여 정의할 수 있다.
	Phone(String phoneBrand, int phoneSeries){
		brand = phoneBrand;
		series = phoneSeries;
	}
	
	
	Phone(String phoneBrand, int phoneSeries, String phoneColor){
		brand = phoneBrand;
		series = phoneSeries;
		color = phoneColor;
	}
	
	// 메서드
	void phoneInfo() {
		System.out.println("브랜드"+brand + " " +"시리즈"+series + " " +"색상"+color);
	}

}
