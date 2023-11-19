package section5;

public class Do_While {

	public static void main(String[] args) {
		// while 문 : 조건식부터 검사 한다.
//		int i = 1;
//		
//		while (i<10) {
//			System.out.println(i);
//			i++;
//		}
//		
		
		// do ~while 문 : 먼저 실행문을 실행시키고 조건식을 검사해서 반복해라.
		int i = 1;//0, 1, 10 다 넣어보셈
		
		do {
			i++;
			System.out.println(i);
		} while(i < 10);
		
	}
}
