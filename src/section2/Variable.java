package section2;

public class Variable {
	public static void main(String[] args) {
		// 변수를 선언한다
		// 변수 : 데이터를 저장하기 위해 프로그램에 의해 이름을 할당받은 메모리 공간
		// 즉, 데이터를 저장하기 위한 공간
		
		// 변수 선언 : 내가 데이터를 저장할거니까 공간을 달라
		// 데이터타입 변수명;
		String name; // name 이라는 이름을 가진 메모리 공간을 할당받음
		int age;	// age라는 이름을 가진 메모리 공간을 할당받음
		
		// 숫자를 처음으로 할 수 없음
		int top10;
//		int 10top; 안된다
		
		int top_;
//		int public;
		
		// 카멜 표기 법 : 두 개 이상의 단어를 조합할 때 두 번째 단어부터는 첫글자를 대문자로 사용
		String userName;
//		String username; 가독성의 차이다. 카멜표기법이 가독성 ㅅㅌㅊ임
		String user_name;
		
		String userPhoneNumber;
		String user_phone_number;
		// 스네이크 표기법 : 모두 소문자로 작성하고 단어 간의 구분을 언더바로 표기
		//개인적으로 스네이크 > 카멜 > 무지성표기법인듯 무조건 지키는것은 아니고 암묵적인룰이다.
	}

}
