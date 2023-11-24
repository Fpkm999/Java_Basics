package section2;

public class DataType {
	public static void main(String[] args) {
		// 데이터 타입 
		// 정수형
		// byte : -128 ~ 127
		byte a = 127;
		byte b = -128;
		long c = 2147483648l;
//		int  f = 3.14; 틀린 자료형
		
		int age = 24;
		// 실수형
		float score = 3.14F;
		double score2 = 3.14;
		
		// 문자형
		char d = 'A';
		char e = '가';
		
		// 논리형
		boolean g = true;
		boolean h = false;
		
		// 참조 자료형
		String i = new String("자바"); //문자열을 담아주는 자료형
		String j = new String("자바");
		System.out.println(i == j);
		//String도 class
		//int double String

		String k = "JAVA";
		String l = "JAVA";
		System.out.println(k==l);

		
		
	}
}
