package chapter3;

import java.util.Scanner;

public class Exam012 {

	public static void main(String[] args) {

//		int age = 20;
//		System.out.println(age > 19 ? "성인입니다" : "청소년입니다");
//
//		age = 14;
//		System.out.println(age > 19 ? "성인입니다" : "축법소년입니다");
//	
		/*
		 * 사용자에게 나이를 입력 받는 방식으로 변경하시오
		 * 예 ) 나이를 입력하세요 > 20
		 * 성인입니다.
		 */
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("나이를 입력하세요 : ");
		
		int age = scanner.nextInt();
		
//		System.out.println(age > 19 ? "성인입니다" : "청소년입니다");
		System.out.println(age > 19 ? "성인입니다" : age > 14 ? "청소년입니다" : "축법소년입니다");
		
		scanner.close();
	}

}
