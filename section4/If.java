package section4;

public class If {

	public static void main(String[] args) {
		
		// 조건식  : ture(참) 또는 false(거짓), boolean 으로 결과를 확인할 수 있는 모든 식

		// 실행문  : 조건식의 결과가 true(참)일 때 실행
		
//		if (조건식) {
//			실행문
//		}
//		int a = 3;
//		int b = 2;
//		int bigNumber = 0;
//		
//		// 만약 a가 b보다 크다면 bigNumber는 a의 값을 가지게 된다.
//		if (a > b) {
//			bigNumber = a;
//		}
//		System.out.println(bigNumber);	//3 출력
		
//		int myAge = 27;
//		
//		if (myAge > 19) {
//			System.out.println("성인입니다.");
//		}
		
		// 예제 ) 홀수인지 짝수인지 판별하시오.
		
		int number = 11;
		
		// 예상 출력 : 홀수입니다.
		
		if ((number % 2) != 0) {
			System.out.println("홀수입니다.");
		}
		
	}
}
