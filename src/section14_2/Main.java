package section14_2;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int myAge = sc.nextInt();
		
		try {
		if (myAge >19 ) {
			System.out.println("성인입니다.");
		} else if (myAge  <=19 && myAge >0){ // 1~19
			System.out.println("미성년자입니다.");
		} else if (myAge <=0) {
			throw new AgeMinusException("나이를 1이상 입력해주세요.");
			}
		} catch (AgeMinusException e) {
			System.out.println("에러메시지 : "+ e.getMessage());
		}
	}

}
