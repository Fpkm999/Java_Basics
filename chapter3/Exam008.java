package chapter3;

public class Exam008 {

	public static void main(String[] args) {

		/*
		 * 비교 연산자
		 * 비교를 해서 참인지 거짓인지 확인 하는게 목적.
		 * 결과값은 true or false <- booelan 값
		 */
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a < b);	// true
		System.out.println(a > b);	// false
		System.out.println(a + b <= c);	// 산술 연산자가 비교 연산자 보다 먼저 실행된다. // true
		System.out.println(a + b >= c);	// true
		
		System.out.println(a <= b + c);
	}

}
