package chapter2;

public class Etc0201 {

	public static void main(String[] args) {
		
		// 문자를 숫자로
		char ch = 'A'; 
		int code = (int)ch; // ch에 저장된 값을 int 형으로 변환하여 저장한다. int는 4바이트 ch는 2바이트 이므로 자동 형변환이 일어난다.
	
		char ch2 = 65; // 숫자를 대입해도 된다. char문자 자료형은 아스키 코드(정수)랑 매핑이 되기 때문
		
		int code2 = 68;
		char ch3 = (char)code2;
//		char ch3 = 65530;
//		char ch4 = "A"; 에러뜸. Type mismatch: cannot convert from String to char
//		char ch5 = 'aB'; Invalid character constant
		
		System.out.println("char ch : "+ch); // A
		System.out.println("int code : "+code); // 65
		System.out.println("char ch2 : "+ch2); // A
//		System.out.println(ch3);
		System.out.println("ch3 : "+ch3); // D
		
		char ch4 = '가';
		int code3 = (int)ch4;
		System.out.println(code3);
		/*
		 * char
		 * 문자, 정수 자료형 타입
		 * 2Byte
		 * 작은 따옴표'' 를 사용함
		 * 한글자만 가능
		 * 아스키 코드(0~65535)와 대응됨 0~65535의 정수 대입 가능함
		 * 문자로 입력한 값을 정수로 출력하고 싶으면 자동 형변환을 하면됨
		 * 아스키 코드 0 ~127 총 128개(7bit). 그이후의 값은 유니코드로 대응됨
		 */
	}

}
