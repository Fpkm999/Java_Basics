package section10;

public class Main {
	public static void main(String[] args) {
		
		// TITLE : 상속 연습
		Comic comicBook = new Comic(); // 객체 생성
							// 생성자 호출
		comicBook.title = "원피스";
		comicBook.price = 5000;
		
		comicBook.info();
		
		System.out.println("======================");
		
		Samsung samsungPhone = new Samsung();

		Apple applePhone = new Apple();
		
		samsungPhone.brand = "갤럭시";
		samsungPhone.color = "아우라블루";
		samsungPhone.series = 23;
		
		applePhone.brand = "애플";
		applePhone.color = "스페이스실버";
		applePhone.series = 15;
		
		samsungPhone.info();
		applePhone.info();
		
		System.out.println("======================");

		Comic comicBook2 = new Comic("원피스", 5000, 9);
		
		comicBook2.info();
		
		System.out.println("======================");

		Comic2 comicBook3 = new Comic2("원피스", 5000, 8);

		// 부모 클래스에 생성자에 맞춰서 만들어 줘야 한다. 매개변수는 추가도 가능하다.

		System.out.println("======================");

		Notebook notebook = new Notebook();

		notebook.powerOn();
		Macbook macbook = new Macbook();
		macbook.powerOn();
		
		System.out.println("======================");
		//메소드 오버로딩
		Samsung samsungPhone2 = new Samsung();
		
		Apple applePhone2 = new Apple();
		
		samsungPhone2.brand = "Galaxy";
		samsungPhone2.color = "아우라블루";
		samsungPhone2.series = 23;
		
		applePhone2.brand = "APPLE";
		applePhone2.color = "스페이스실버";
		applePhone2.series = 15;
		
		samsungPhone2.info();
		// 자식 클래스에서 재정의된 메서드를 호출
		
		applePhone2.info();
		
		
		System.out.println("======================");

		
		SchoolBus sb = new SchoolBus();
		sb.ride();//가장 자식클래스에서 재정의된 메서드 호출
		//상속을 할 때 순서가 중요
		
		System.out.println("======================");

		int myAge = 27;
		myAge = 28;
		// 상수 : 초기화 이후 값을 바꿀 수 없음
		// 상수명은 스네이크 기법을 사용함, 전체 스펠링을 대문자로 사용 한다
		final int MY_AGE = 27; // final 을 붙이기 전에는 변수 였음. final 을 붙여서 상수가 됨
		
//		MY_AGE = 28; 오류뜸
		
//		final int MY_AGE; 이건됨. 초기화 이후가 안되므로 초기화까지는 된다.
//		MY_AGE = 27; 27이거까지 넣어지고 상수가됨
		// 암호키? 같은 곳에서 사용함
		
	}
}
