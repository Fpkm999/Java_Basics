package section5;

public class While {

	public static void main(String[] args) {
		// while 문 : 정해진 횟수가 없을 때 사용하는 반복문
//		for (int i = 1 ; i < 10; i++) {
//			System.out.println(i);
//		}
//		System.out.println("====================================");
//			
//		//for문을 while 문으로 변경해보면..

//		int i = 1; // for  문의 초기화 식
//		
//		while(i<10) { // for 문의 조건식
//			System.out.println(i); // 실행문
//			
//			i++;  // for 문의 증감식
//		}
		
		/*
		 * 예제 : 1부터 100까지 숫자 중 짝수의 합 출력 (while 문)
		 * 
		 * 예상 출력
		 * 합 :2550
		 * 
		 */
		int sum = 0;
		int i =1;
		
		while (i <= 100) {
			if((i%2) ==0) {
			sum += i;
			}
			
			i++;
		}
		System.out.println("합 : "+sum);
	}
}
