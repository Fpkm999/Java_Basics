package section10;

public class Comic2 extends Book2 {
	int series;
	Comic2(String title, int price, int series) {
		super(title, price);
		this.series = series;
	}
}
//자식에만 생성자를 만들어서 사용
//부모에서만 생성자를 생성해서 사용 -> 오류뜬다, 자식클래스에도 생성자 만들어줘야함
//부모 매개변수는 다 가져와야됨-> 이때는 super()하면됨
//
