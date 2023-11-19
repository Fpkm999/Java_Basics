package section10;
// 부모 클래스
public class Book {
	// 필드
	String title; // 책 제목
	int price; // 책 가격
	// 메서드
	// 책 정보를 출력하는 메서드
	void info() {
		System.out.println("책 제목 : " +title + ", 가격: "+price);
	}

}
// 부모 클래스에만 필드와 메서드를 생성했다.
