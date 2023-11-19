package section2;

public class Printf {
	public static void main(String[] args) {
		/*
		 *  %d : 10진수
		 *  %s : 문자열
		 *  %f : 실수
		 **/
		System.out.printf("%d\n",10); //정수, 실수등 모든 숫자는 쌍따옴표 없이 작성해야한다.
		System.out.printf("%s\n","자바"); // 쌍따옴표가 들어가면 무조건 문자열이다
		System.out.printf("%.2f",3.14);//10자바3.140000이 출력됨 %.2f 로 소수점 둘째 자리까지만 출력하도록 조정
		System.out.printf("%.2f", 3.14);
		
		System.out.println();
		
		System.out.printf("%d  %s %.2f", 10, "자바", 3.14);
		
		System.out.println();
		
		/*
		 * 예제) 학년, 이름, 학점을 서식문자를 이용해 출력하세요.
		 * 
		 * 
		 * 예상 출력 : 저는 대학교 3학년 XXX이고 학점은 3.88입니다.
		 */
		
		//sol1
		System.out.printf("저는 대학교 %d학년 %s이고 학점은 %.2f입니다." , 3 , "오세빈", 3.14);
		
		System.out.println();
		//sol2
		System.out.printf("저는 대학교 %d학년",3);		
		System.out.printf(" %s이고 학점은","오세빈");
		
		System.out.printf(" %.2f입니다.",3.14);
	}
//	\n : 줄바꿈.스케이프 문자, "" 안에 있어야함
}
