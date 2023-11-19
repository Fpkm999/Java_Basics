package section2;

public class Variable2 {
	public static void main(String[] args) {
		// 변수 초기화 : 변수를 선언하고 처음으로 값을 대입(동일하다는 의미 X), 프로그램에서의 대입은 오른쪽의 값을 왼쪽에 넣는것
		/*
		String name; // 데이터타입 변수명; 변수 선언
		name = "오세빈"; // 변수 초기화
		
		int age; // 데이터 타입 변수명; 변수 선언
		age = 24; // 변수 초기화
		*/
		
		// 변수의 선언과 초기화를 동시에 작성 가능
		String name = "오세빈";
		int age = 24;
		
		// [ ](대괄호), { }(중괄호), ( )(소괄호)
//		my_age =11; {} 중괄호 안에 있더라도 대입할려고하면 선언된 문장 뒤에 와야 된다.
		int my_age = 24;
		int friend_age = my_age;
		System.out.println(my_age);
		
		/*
		 *  두 변수의 값을 서로 바꾸시오.
		 * 
		 * int myApple = 15;
		 * int yourApple = 30;
		 * 
		 * 예상 출력
		 * 사과 개수가 바뀌어서
		 * 나의 사과 개수는 30개이고
		 * 너의 사과 개수는 15개이다.
		 */
		
		
		int myApple =15;
		int yourApple = 30;
		int appleTemp = 0;
		
		appleTemp = myApple; // temp에 15
		myApple=yourApple; //myApple에 30
		yourApple=appleTemp; //yourApple에 15
		
		System.out.println("사과 개수가 바뀌어서");
		System.out.println("나의 사과 개수는" + myApple   +"개이고");
		System.out.println("너의 사과 개수는" + yourApple +"개이다.");
		
	}
}
