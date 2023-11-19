package section4;

public class If4 {

	public static void main(String[] args) {
//		// if-else if 문
//		
//		int favorite = 7;
//		
//		// if = 참이면 실행.
//		if (favorite == 7) {
//			System.out.println("좋아하는 숫자가 7입니다.");
//		}
//		// else if = 그렇지 않으면 조건식을 비교한다.
//		else if (favorite < 5) {
//			System.out.println("좋아하는 숫자가 5보다 작습니다.");
//		}
//		// else if = 그렇지 않으면 조건식을 비교한다.
//		else if (favorite > 5) {
//			System.out.println("좋아하는 숫자가 5보다 큽니다.");
//		}
//		// 다 틀렸으면 조건식을 비교한다.
//		else {
//			System.out.println("좋아하는 숫자가 5입니다.");
//		}
		
		// 예제 : 성적을 출력하시오.
		int grade = 71;
		
		// 90 점 이상 : A
		// 80 점 이상 : B
		// 70 점 이상 : C
		// 그 외 : D
		
		// 예상 출력 : C 입니다.
		
		if (grade >= 90) {
			System.out.println("A 입니다.");
		}else if (grade >= 80) {
			System.out.println("B 입니다.");
		}else if (grade >= 70) {
			System.out.println("C 입니다.");
		}else {
			System.out.println("D 입니다.");
		}
	}
}
