package phone;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 실행용
		Phone1 p1 = new Phone1();
		Phone1 p2 = new Phone1("galaxy");
		Phone1 p3 = new Phone1(23);
		Phone1 p4 = new Phone1("g.alaxy",24);
		Phone1 p5 = new Phone1("iphone", 14, "스페이스그레이");
		
		Scanner sc = new Scanner(System.in);

		sc.nextInt();
//	 public static final InputStream in = null;
		System.out.println();
		// in이 바로 붙을 수 있는거 static라서 바로 불러올 수 있음. out도 마찬가지
		   
		p1.phoneInfo();
		p2.phoneInfo();
		p3.phoneInfo();
		p4.phoneInfo();
		p5.phoneInfo();
		
		String name = "김김김";

		name.codePointBefore(0);
		name.charAt(0);
		sc.close();
	}
}// 클래스 구성 3요소 : 생성자, 필드, 메서드
// System 클래스
// in 필드
