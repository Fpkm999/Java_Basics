package section7;
import java.awt.*;
import java.util.Scanner;
//import : 다른 패키지에 있는 클래스 를 가져옴

// 자동차 실행용 클래스
public class Main {

	public static void main(String[] args) {

		Car car = new Car();	// 객체 생성. 자동차1. new Car() 는 생성자 메서드이다.

		// 객체 생성 : 클래스라는 설계도를 가지고 객체를 만들었다는 의미

		Car car2 = new Car(); // 자동차2 객체 생성
		// Car 라는 클래스(설계도)를 가지고 자동차를 여러개 만들 수 있다.

		System.out.println("");

		System.out.println("자동차1의 Wheel의 개수는 : "+car.wheel); //arr.length() 처럼 클래스에 선언된 메서드를 호출하는 것과 같음
		System.out.println("자동차2의 Wheel의 개수는 : "+car2.wheel);
		// result
		// 자동차1의 Wheel의 개수는 : 4
		// 자동차2의 Wheel의 개수는 : 4
		// 동일한 설계도로 만들었으니 값은 동일하다.

		car.wheel = 5; //메인클래스에서 변경이 가능하다.
		System.out.println("자동차1의 Wheel의 개수는 : "+ car.wheel);

		car.ride();	// 메서드 실행
		car2.ride();

		// 필드 호출과 메서드 호출의 차이점?
		// 괄호 여부이다.

		// 여기까지가 Car 라는 자동차 설계도(클래스)를 이용한 연습

		System.out.println("===================================================");

		Family father = new Family();
		Family son = new Family();

		System.out.println("아빠의 집 주소 : "+father.address);	// 아빠의 주소
		System.out.println("아들의 집 주소 : "+son.address);			// 아들의 주소

		// result
		// 아빠의 집 주소 : 대구
		// 아들의 주소 : 대구

		// 만약 아들이 서울로 자취를 하기 시작했다면?
		son.address = "서울"; //아들만 서울로 이사를 감

		System.out.println("아들만 서울로 이사감");
		System.out.println("아빠의 집 주소 : " +father.address); // 아빠의 주소
		System.out.println("아들의 집 주소 : "+son.address); // 아들의 주소

		// 값이 둘다 변해버렸다. 왜그럴까?
		// 범인은 static 라서 그렇다. static 이 안붙은 Family2 클래스로 테스트해보자.

		Family2 family2 = new Family2();	// 객체 생성

		System.out.println("거주지 : "+family2.address);	// 일단 거주지는 대구로 설정되어있다.
		System.out.println(family2.address);
		System.out.println(Family.address);

		Family2 father$ = new Family2();
		Family2 son$ = new Family2();

		son$.address = "서울";

		System.out.println("아빠의 집 주소 : " +father$.address); // 아빠의 주소
		System.out.println("아들의 집 주소 : "+son$.address); // 아들의 주소


		// TITLE : static
		// 정적 멤버 static 붙은 필드
		// 클래스명.필드값 or 클래스명.메서드

		// 사실
		// Family family = new Family();
		// System.out.println(family.address);
		// 이렇게 해도 되지만 정적 맴버는 이미 메모리에 올라와 있는데 굳이 객체 생성까지 하면서 호출하면 하지말라고
		// 권고하는 줄이 생기는 것을 확인할 수 있다.

		System.out.println("===================================================");
		// TITLE : Scanner
		//이거 안쓰는 이유. 콘솔창에서만 쓸수 있음. 코딩테스트에도 쓰임
		//Scanner sc = new Scanner(System.in); // Scanner 클래스의 객체 생성

		//int num = sc.nextInt();	// nextInt 라는 메서드 호출
		//String name = sc.nextLine(); // newt 혹운 LextLine 가 문자열을 받는 메서드

		//System.out.println(num);
		//System.out.println(name);
	}
}
