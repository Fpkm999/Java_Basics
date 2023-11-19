package section4;

public class If3_else {

	public static void main(String[] args) {
		// if-else 만약-만약이 아니라면
		
//		int a = 3;
//		int b = 4;
//		
//		if (a > b) {
//			System.out.println("a가 b보다 큽니다.");
//		// else : if 문에서 false(거짓)이 나오게 된다면 실행된다.
//		} else {
//			System.out.println("a가 b보다 작거나 같습니다.");
//		}
		
//		int myAge = 18;
//		if (myAge > 19) {
//			System.out.println("성인입니다.");
//		} else {
//			System.out.println("미성년자입니다.");
//		}
		
		// 홀수인지 짝수인지 판별하시오.
		int number = 1;
		
		if ((number%2) == 0 ) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
}