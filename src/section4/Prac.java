package section4;

public class Prac {

	public static void main(String[] args) {
		// if else if
		// 국어의 성적은 90
		// 수학의 성적은 70
		// 영어의 성적은 100
		// 3과목을 합쳐서 평균 성적이 80 이상이면 "통과" 그렇지 않으면 "불합격"을 구현하시오.
		
//		int korean = 90;
//		int math = 70;
//		int english = 100;
//		
//		if ( (korean+math+english)/3 >= 80) {
//			System.out.println("통과");
//		}else {
//			System.out.println("불합격");
//		}
		
		
		//-----------------------------------------------------------------------
		
		
		
		// int number 변수의 값은 임의로 결정한다.
		// if의 내용들은 다음과 같다.
		// 1~10까지의 수가 나온다면 "1부터 10까지의 범위에 속합니다." 가 떠야한다.
		// 11~20까지의 수가 나온다면 "11부터 20까지의 범위에 속합니다." 가 떠야한다.
		// 21~30까지의 수가 나온다면 "21부터 30까지의 범위에 속합니다." 가 떠야한다.
		// 그 외의 수가 나온다면 " 기타 범위에 속합니다." 가 떠야한다.
		
		int number = -1;

		if (number >= 1) {
			if (number <= 10) {
				System.out.println("1부터 10까지의 범위에 속합니다.");
			}
			else if (number <= 20) {
			System.out.println("11부터 20까지의 범위에 속합니다.");
			}
			else if (number <= 30) {
				System.out.println("21부터 30까지의 범위에 속합니다.");
			} else {
				System.out.println("기타 범위에 속합니다.");
				}
		} else {
			System.out.println("기타 범위에 속합니다.");
		}
	}
}
