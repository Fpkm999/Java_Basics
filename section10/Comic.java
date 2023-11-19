package section10;
// 자식 클래스
public class Comic extends Book {
	int series; // 시리즈
	// 자식 클래스에만 단독으로 만듬
	Comic(){	// 기본 생성자
		
	}
	Comic(String title, int price, int series) {//부모에 있는 필드가있다
		super.title = title;
		super.price = price;
		this.series = series;
	}
	
}
// 부모 클래스에 있는 title, price 필드를 super를 이용하면 접근이 가능하다
