package chapter2;

public class Exam004 {

	public static void main(String[] args) {

		/*
		 * 산술 연산자
		 * 변수 또는 상수와 함께 사용하여 기본적인 계산을 할 수 있음.
		 * 나머지 연산자는 데이터 타입이 정수형인 경우에만 사용.
		 */
		int num1 = 10; // a에 10을 대입
		int num2 = 3; // b에 3을 대입
		
		System.out.println(num1 + num2);	// 13
		System.out.println(num1 - num2);	// 7
		System.out.println(num1 * num2);	// 30
		System.out.println(num1 / num2);	// 3
		System.out.println(num1 % num2);	// 나머지 연산. a를 b로 나눈 후 나머지를 반환.

		// 나머지 연산을 짝수, 홀수 구분에 사용. // 1
		System.out.println(num1 % 2);	// 0
		System.out.println(num2 % 2);	// 1

		/*
		2를 %연산 하면 홀수, 짝수를 구분할 때 사용할 수 있다. 이때 나오는 나머지값은 2개 0,1
		3을 %연산하면 나오는 나머지 값은 3개 0,1,2

		%연산할려는 값-1이 나올수 있는 값 개수이다.

		 */
	}

}
