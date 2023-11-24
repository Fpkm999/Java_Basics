package section5;

public class Break {
	public static void main(String[] args) {
		// break 문 : 반복문을 미리 종료
		// 조건식이 false 가 아니더라도 종료
	
		int i = 1;
		
		while(true) {//횟수가 정해져있지 않을 때 사용
			System.out.println(i);	
			i++;
			if(i == 5) {
				System.out.println("반복문 종료");
				break;
			}
		}
	}
}
