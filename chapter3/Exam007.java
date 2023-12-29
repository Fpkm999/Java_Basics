package chapter3;

public class Exam007 {

	public static void main(String[] args) {

		/*
		 * 증감 연산자
		 * 단독으로 쓰이는 경우가 아니면 위치에 따라 결과값이 다름
		 */
		
		int a = 1;
		
		System.out.println(a); // 1
		
		a++;
		
		System.out.println(a); // 2
		
		System.out.println(++a); // 3 전위
		
		System.out.println(a++); // 3 println 출력후 4가됨 // 후위
		
		System.out.println(a); // 4
		
	}

}
