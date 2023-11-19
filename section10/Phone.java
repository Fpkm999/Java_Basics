package section10;

public class Phone {
	String brand; // 휴대폰 브랜드
	int series; // 휴대폰 시리즈
	String color; // 휴대폰 색상
	
	// 휴대폰 정보를 출력하는 메서드
	void info() {
		System.out.println("브랜드 : "+brand+"시리즈 : "
	+series+"색상 : "+color);
	}
}
