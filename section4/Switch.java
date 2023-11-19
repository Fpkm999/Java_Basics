package section4;

public class Switch {

	public static void main(String[] args) {
		// 스위치문도 조건문중에 하나임.
		// 
//		int number = 2;
//		
//		// switch(number) : 조건문의 변수를 확인한다
//		// switch는 앞의 case가 맞으면 뒤에 case문은 조건확인을 안하고 바로 실행시키는 성질이 있다. break가 있는 이유.
//		// break : 제어문에서 break가 나오게 된다면 멈추게 되는 성질이 있다.
//		switch(number) {
//		case 1:
//			System.out.println("number는 1입니다.");
//			break;//case 문을 실행하고 빠져나가라
//		case 2:
//			System.out.println("number는 2입니다.");
//			break;
//		default:	//default : 조건문에 해당하지 않는다면 실행
//			System.out.println("number는 1도 2도 아닙니다.");
//		}
//		
		// 예제 : 성적을 출력하시오.
		int grade = 85;
		
		// 90 점 이상 : A
		// 80 점 이상 : B
		// 70 점 이상 : C
		// 그 외 : D
		
		// 예상 출력 : B 입니다.
		switch (grade/10) {
		case 9,10:
			System.out.println("A 입니다.");
			break;
		case 8:
			System.out.println("B 입니다.");
			break;
		case 7:
			System.out.println("C 입니다.");
			break;
		default:
			System.out.println("D 입니다.");
			// default에는 berak를 거는건 자유. 뭐 차이는 없음
		}
		
	}
}
