package section7;
import java.util.Scanner;
//import : 다른 패키지에 있는 클래스 를 가져옴

// 자동차 실행용 클래스
public class Main {

	public static void main(String[] args) {
		
//		Car car = new Car();	// 객체 생성. 자동차1. new Car()는 생성자 메서드임.
//		// 객체 생성 이란 : 설계도를 가지고 객체를 만들었다.
//		Car car2 = new Car(); // 자동차2
//		//Car라는 클래스의 설계도를  가지고 자동차를 여러개 만들수있음
//		
////		System.out.println("자동차1의 wheel의 개수는 : " +car.wheel);//arr.length() 처럼 클래스에 선언된 메서드를 호출하는것
////		System.out.println("자동차2의 wheel의 개수는 : "+car2.wheel);
////		//동일한 설계도로 만들었으니까 값은 동일하다
////		car.wheel = 5; //메인클래스에서 변경
////		System.out.println("자동차1의 wheel의 개수는 : " +car.wheel);	
//		
//		
//		car.ride();	//메서드 실행
//		//필드 호출과 메서드 호출의 차이 괄호
//		
//		//여기까지가  Car이용
//		//--------------------------------------------------------------//
//		Family father = new Family();
//		Family son = new Family();
//		
//		System.out.println("아빠의 주소 : "+ father.address); // 아빠의 주소
//		System.out.println("아들의 주소 : "+ son.address);    // 아들의 주소
//		
//		son.address = "서울";//아들만 서울로 이사를 간다면
//
//		System.out.println("아빠의 주소 : "+ father.address); // 아빠의 주소
//		System.out.println("아들의 주소 : "+ son.address);    // 아들의 주소
//		Family2 family2 = new Family2();	// 객체 생성
//	
//		System.out.println(family2.address);
//
//		System.out.println("====================");
//		
//		System.out.println(Family.address);
//		// 정적 맴버 static 붙은 필드
//		// 클래스명.핃드값 or 클래스명.메서드
//		// 
//		
//		Family family = new Family();
//		System.out.println(family.address);// 이렇게 해도 되지만 정적 맴버는 이미 메모리에 올라와있는데 굳이 객체생성까지 하면서 하지말라 권고하는 줄이 생김
//		
		//이거 안쓰는 이유. 콘솔창에서만 쓸수 있음. 코딩테스트에도 쓰임
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();	//nextInt라는 메서드
		String name = sc.nextLine();// next 혹은 nextLine 가 문자열 받는 메서드
		
		System.out.println(num);
		System.out.println(name);
	}
}
