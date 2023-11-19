package section4;

public class If2 {

	public static void main(String[] args) {
		// 중첩 if 문
		
		int a = 6;
		
		// 만약에 a를 2로 나눴을 때 나머지가 0이라면 안의 실행코드가 실행된다.
		if (a % 2 == 0) {
			// 만약 a 를 3으로 나눴을 때 나머지가 0이라면 안의 실행코드가 실행된다.
			if (a % 3 == 0) {
				System.out.println("a는 2와 3의 배수입니다.");
			}
		}
	}

}
