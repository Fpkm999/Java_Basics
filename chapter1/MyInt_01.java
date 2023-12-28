package chapter1;

public class MyInt_01 {

	public static void main(String[] args) {
		// 제품 가격이 3만원 저장 후 출력
		int price = 30000;
//		byte price = 30000;
		
		int price2 = 30000;
		
		System.out.println(price);
		System.out.println(price2);

	}

}
/*
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
   Type mismatch: cannot convert from int to byte	<-- 에러 코드 #중요.
   
   at chapter1.MyInt_01.main(MyInt_01.java:7)
   
   먼저 발생한 에러만 표시해줌
*/
