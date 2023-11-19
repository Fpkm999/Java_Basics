package section2;

public class TypeConversion {

	public static void main(String[] args) {
		// 강제 형 변환
		double a = 3.14; // double은 8바이트
		int b = (int)a; // int 4바이트, 그냥 a를하면 double이기 때문에 오류가 뜬다 그래서 (int)를 줘서 강제 형변환을 한다.
		
		System.out.println(a);
		System.out.println(b);
		
		// 자동 형변환
		int c = 3; // 4바이트
		double d = c; // 8바이트
		//15line 의 c는 (double)c가 생략이 되어있는거임. 이미 (double)가 자동으로 적용됨 작은 자료형에서 큰 자료형으로 변환할때는..
		System.out.println(c); 
		System.out.println(d);
		
		
	}

}
