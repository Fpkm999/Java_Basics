package section5;

public class Continue {

	public static void main(String[] args) {
		// continue 문 : 반복문에서 continue를 만나면 이후의 코드는 실행하지 않고 반복문의 처음으로 돌아감
		
//		for (int i=1; i<=10; i++) {
//			if(i == 5) {
//				continue;	//continue을 만나면 이후의 실행문(12line)은 실행안되고 증감식으로 간다.
//			}
//			System.out.println(i);
//		}
	
		int sum = 0;
		
		for(int i = 1 ; i<=100; i++) {
			if( i%2 != 0) { //홀수
				continue;
			}
			sum+=i;
		}
		System.out.println("합 : "+sum);
	}
}